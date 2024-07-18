package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;
import org.pablocastillo.webapp.service.DireccionService;

@WebServlet("/direccion-servlet")
@MultipartConfig
public class DireccionServlet extends HttpServlet {

    private DireccionService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new DireccionService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Direcciones> direcciones= ps.listarDireccion();
        req.setAttribute("direcciones", direcciones);
        req.getRequestDispatcher("direccion/listar-direccion/listar-direccion.jsp").forward(req, resp);
    }

    
    
}