package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Blob;
import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoFemeninos;
import org.pablocastillo.webapp.service.ProductoFemeninoService;

@WebServlet("/femenino-servlet")
@MultipartConfig
public class ProductoFemeninoServlet extends HttpServlet {

    private ProductoFemeninoService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new ProductoFemeninoService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProductoFemeninos> productoFemeninos= ps.listarProductoFemenino();
        req.setAttribute("productoFemeninos", productoFemeninos);
        req.getRequestDispatcher("productos-femeninos/listar-femeninos/listar-femeninos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarProductoFemenino(req, resp);
        }else{
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
    public void agregarProductoFemenino(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String nombre = req.getParameter("nombreProducto");
        Double precio = Double.parseDouble(req.getParameter("precioCompra"));
        String descripcion = req.getParameter("descripcionProducto");
        int cantidad = Integer.parseInt(req.getParameter("cantidadStock"));
        Double precioVU = Double.parseDouble(req.getParameter("precioVentaUnitario"));
        int distribuidor = Integer.parseInt(req.getParameter("distribuidorId"));
        int categoriaProducto = Integer.parseInt(req.getParameter("categoriaproductoId"));
        
        ps.agregarProductoFemenino(new ProductoFemeninos(nombre, precio, descripcion, cantidad, precioVU, distribuidor, categoriaProducto));
        
        //resp.sendRedirect("/SGBDProductosIN5CM/index.jsp");
        resp.sendRedirect(req.getContextPath() +  "/");
    }
}