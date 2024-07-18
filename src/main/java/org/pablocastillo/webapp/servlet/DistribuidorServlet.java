package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
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

    
    
}