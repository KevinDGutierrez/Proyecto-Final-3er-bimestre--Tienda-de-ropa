<<<<<<< HEAD
=======

>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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
import java.util.ArrayList;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
import java.util.List;
import org.alejandrocuxun.webapp.model.Distribuidores;
import org.pablocastillo.webapp.service.DistribuidorService;

@WebServlet("/distribuidor-servlet")
@MultipartConfig
public class DistribuidorServlet extends HttpServlet {

    private DistribuidorService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new DistribuidorService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Distribuidores> distribuidores= ps.listarDistribuidor();
        req.setAttribute("distribuidores", distribuidores);
        req.getRequestDispatcher("distribuidor/listar-distribuidor/listar-distribuidor.jsp").forward(req, resp);
    }
<<<<<<< HEAD

    
    
}
=======
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        
        if(path == null || path.equals("")) {
            agregarDistribuidor(req, resp);
        }
    
    }
    
    public void agregarDistribuidor(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombreDistribuidor = req.getParameter("nombreDistribuidor");
        String direccionDistribuidor = req.getParameter("direccionDistribuidor");
        String nitDistribuidor = req.getParameter("nitDistribuidor");
        String telefonoDistribuidor = req.getParameter("telefonoDistribuidor");
        String web = req.getParameter("web");
        
        ps.agregarDistribuidor(new Distribuidores(nombreDistribuidor, direccionDistribuidor, nitDistribuidor, telefonoDistribuidor, web));
        
        resp.sendRedirect(req.getContextPath() + "/");
    }
    
    
}
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
