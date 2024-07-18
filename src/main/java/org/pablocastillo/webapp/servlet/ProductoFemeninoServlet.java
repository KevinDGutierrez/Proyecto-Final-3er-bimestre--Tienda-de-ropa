package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    
    
}