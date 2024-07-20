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

    
    
}