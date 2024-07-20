package org.ianalfaro.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
import java.util.List;
import org.ianalfaro.webapp.service.CiudadService;
import org.kevingutierrez.webapp.model.Ciudad;

@WebServlet("/ciudad-servlet")
@MultipartConfig
public class CiudadServlet extends HttpServlet{
<<<<<<< HEAD
    
=======

>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    private CiudadService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new CiudadService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ciudad> ciudades = ps.listarCiudad();
        req.setAttribute("ciudades", ciudades);
        req.getRequestDispatcher("ciudades/listar-ciudades/listar-ciudades.jsp").forward(req, resp);
    }
    
<<<<<<< HEAD
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        ArrayList<String> ciudad = new ArrayList<>();

        String nombreCiudad = req.getParameter("nombreCiudad");
        
        ciudad.add(nombreCiudad);
        
        req.setAttribute("ciudad", ciudad);
        req.setAttribute("mensaje", "¡¡Ciudad agregado con exito :D!!");
        getServletContext().getRequestDispatcher("ciudades/formulario-ciudades/formulario-ciudades.jsp").forward(req, resp);
=======
     
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarCiudad(req, resp);
        }
    }
    
    public void agregarCiudad(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String nombreCiudad = req.getParameter("nombreCiudad");
        
        ps.agregarCiudad(new Ciudad(nombreCiudad));
        
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    }
}
