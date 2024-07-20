package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
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
        List<CategoriaProductos> categoriaproductos = ps.listarCategoriaProducto();
        req.setAttribute("categoriaProductos", categoriaproductos);
        req.getRequestDispatcher("categoria-productos/listar-categorias/listar-categorias.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
    
        if(path == null || path.equals("/")) {
            agregarCategoriaProducto(req, resp);
        }
    }
    
    public void agregarCategoriaProducto(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombreCategoria = req.getParameter("nombreCategoria");
        String descripcionCategoria = req.getParameter("descripcionCategoria");
        
        ps.agregarCategoriaProducto(new CategoriaProductos(nombreCategoria, descripcionCategoria));
        
        resp.sendRedirect(req.getContextPath() + "/");
    }
}
