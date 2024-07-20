package org.ianalfaro.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.ianalfaro.webapp.service.CiudadService;
import org.kevingutierrez.webapp.model.Ciudad;


public class CiudadServlet extends HttpServlet{

    private static void agregarCiudad(Ciudad cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private CiudadService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new CiudadService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String ciudadId = req.getParameter("ciudadId");
        String nombreCiudad = req.getParameter("nombreCiudad");
        

        Ciudad cliente = new Ciudad(ciudadId, nombreCiudad);
        CiudadServlet.agregarCiudad(cliente);

        resp.sendRedirect(req.getContextPath() + "/index.jsp");
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
