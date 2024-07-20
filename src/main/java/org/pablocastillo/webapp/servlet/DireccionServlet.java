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
import org.alejandrocuxun.webapp.model.Direcciones;
import org.pablocastillo.webapp.service.DireccionService;

@WebServlet("/direccion-servlet")
@MultipartConfig
public class DireccionServlet extends HttpServlet{

    private DireccionService ps;

    @Override
    public void init() throws ServletException {
        super.init();
        this.ps = new DireccionService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Direcciones> direcciones = ps.listarDireccion();
        req.setAttribute("direcciones", direcciones);
        req.getRequestDispatcher("direccion/listar-direccion/listar-direccion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarDirecciones(req, resp);
        }
    }
    
    public void agregarDirecciones(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String calle = req.getParameter("calle");
        String avenida = req.getParameter("avenida");
        String numeroCasa = req.getParameter("numeroCasa");
        int ciudadId = Integer.parseInt(req.getParameter("ciudadId"));
        
        ps.agregarDireccion(new Direcciones(calle, avenida, numeroCasa, ciudadId));
        
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}