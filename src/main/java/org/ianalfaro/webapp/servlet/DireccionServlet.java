package org.ianalfaro.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.pablocastillo.webapp.service.DireccionService;
import org.kevingutierrez.webapp.model.Direccion;


public class DireccionServlet extends HttpServlet{

    private DireccionService ds;

    @Override
    public void init() throws ServletException {
        super.init();
        this.ds = new DireccionService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String direccionId = req.getParameter("direccionId");
        String calle = req.getParameter("calle");
        String avenida = req.getParameter("avenida");
        String numeroCasa = req.getParameter("numeroCasa");
        String ciudadId = req.getParameter("ciudadId");

        Direccion direccion = new Direccion(
            Integer.parseInt(direccionId), 
            calle, 
            avenida, 
            numeroCasa, 
            Integer.parseInt(ciudadId)
        );

        ds.agregarDireccion(direccion);

        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        ArrayList<String> direcciones = new ArrayList<>();

        String calle = req.getParameter("calle");
        String avenida = req.getParameter("avenida");
        String numeroCasa = req.getParameter("numeroCasa");
        String ciudadId = req.getParameter("ciudadId");

        Direccion direccion = new Direccion(calle, avenida, numeroCasa, Integer.parseInt(ciudadId));
        ds.agregarDireccion(direccion);

        direcciones.add(direccion.toString());

        req.setAttribute("direcciones", direcciones);
        req.setAttribute("mensaje", "¡¡Dirección agregada con éxito :D!!");
        getServletContext().getRequestDispatcher("/direcciones/formulario-direcciones/formulario-direcciones.jsp").forward(req, resp);
    }
}


