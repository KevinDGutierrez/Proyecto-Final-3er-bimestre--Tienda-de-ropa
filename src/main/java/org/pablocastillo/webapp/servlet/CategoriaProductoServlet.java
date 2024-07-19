package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.alejandrocuxun.webapp.model.CategoriaProductos;
import org.pablocastillo.webapp.service.CategoriaProductoService;

@WebServlet("/categoria-servlet")
@MultipartConfig
public class CategoriaProductoServlet extends HttpServlet {

    private CategoriaProductoService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new CategoriaProductoService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CategoriaProductos> categoriaProductos = ps.listarCategoriaProducto();
        req.setAttribute("categoriaProductos", categoriaProductos);
        req.getRequestDispatcher("categoria-productos/listar-categorias/listar-categorias.jsp").forward(req, resp);
    }

    
    
}