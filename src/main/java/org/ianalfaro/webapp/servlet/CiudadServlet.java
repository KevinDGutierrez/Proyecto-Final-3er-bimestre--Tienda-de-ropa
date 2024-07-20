package org.ianalfaro.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.ianalfaro.webapp.service.CiudadService;
import org.kevingutierrez.webapp.model.Ciudad;

@WebServlet("/ciudad-servlet")
@MultipartConfig
public class CiudadServlet extends HttpServlet{
    
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
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        ArrayList<String> ciudad = new ArrayList<>();

        String nombreCiudad = req.getParameter("nombreCiudad");
        
        ciudad.add(nombreCiudad);
        
        req.setAttribute("ciudad", ciudad);
        req.setAttribute("mensaje", "¡¡Ciudad agregado con exito :D!!");
        getServletContext().getRequestDispatcher("ciudades/formulario-ciudades/formulario-ciudades.jsp").forward(req, resp);
    }
}
