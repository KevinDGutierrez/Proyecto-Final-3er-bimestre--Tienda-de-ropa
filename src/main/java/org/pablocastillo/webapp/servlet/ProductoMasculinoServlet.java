package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoMasculinos;
import org.pablocastillo.webapp.service.ProductoMasculinoService;

@WebServlet("/masculino-servlet")
@MultipartConfig
public class ProductoMasculinoServlet extends HttpServlet {

    private ProductoMasculinoService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new ProductoMasculinoService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ProductoMasculinos> productoMasculinos= ps.listarProductoMasculino();
        req.setAttribute("productoMasculinos", productoMasculinos);
        req.getRequestDispatcher("productos-masculinos/listar-masculinos/listar-masculinos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarProductoMasculino(req, resp);
        }else{
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
    public void agregarProductoMasculino(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        String nombre = req.getParameter("nombreProducto");
        Double precio = Double.parseDouble(req.getParameter("precioCompra"));
        String descripcion = req.getParameter("descripcionProducto");
        int cantidad = Integer.parseInt(req.getParameter("cantidadStock"));
        Double precioVU = Double.parseDouble(req.getParameter("precioVentaUnitario"));
        int distribuidor = Integer.parseInt(req.getParameter("distribuidorId"));
        int categoriaProducto = Integer.parseInt(req.getParameter("categoriaproductoId"));
        
        ps.agregarProductoMasculino(new ProductoMasculinos(nombre, precio, descripcion, cantidad, precioVU, distribuidor, categoriaProducto));
        
        //resp.sendRedirect("/SGBDProductosIN5CM/index.jsp");
        resp.sendRedirect(req.getContextPath() +  "/");
    }
}