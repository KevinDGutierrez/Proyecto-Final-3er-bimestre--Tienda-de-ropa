package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
=======
import java.sql.Blob;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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

<<<<<<< HEAD
    
    
=======
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarProductoFemenino(req, resp);
        }else{
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
    public void agregarProductoFemenino(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String nombreProducto = req.getParameter("nombreProducto");
        Double precioCompra = Double.parseDouble(req.getParameter("precioCompra"));
        String descripcionProducto = req.getParameter("descripcionProducto");
        int cantidadStock = Integer.parseInt(req.getParameter("cantidadStock"));
        Double precioVentaUnitario = Double.parseDouble(req.getParameter("precioVentaUnitario"));
        int distribuidorId = Integer.parseInt(req.getParameter("distribuidorId"));
        int categoriaProductoId = Integer.parseInt(req.getParameter("categoriaProductoId"));
        
        ps.agregarProductoFemenino(new ProductoFemeninos(nombreProducto, precioCompra, descripcionProducto, cantidadStock, precioVentaUnitario, distribuidorId, categoriaProductoId));
        
        resp.sendRedirect(req.getContextPath() +  "/");
    }
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
}