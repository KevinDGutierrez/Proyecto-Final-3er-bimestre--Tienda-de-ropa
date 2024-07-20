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
import org.ianalfaro.webapp.service.FacturaService;
import org.kevingutierrez.webapp.model.Factura;

@WebServlet("/factura-servlet")
@MultipartConfig
public class FacturaServlet extends HttpServlet{
    
    private FacturaService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new FacturaService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Factura> facturas = ps.listarFactura();
        req.setAttribute("facturas", facturas);
        req.getRequestDispatcher("facturas/listar-factura/listar-factura.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        ArrayList<String> factura = new ArrayList<>();

        String fecha = req.getParameter("fecha");
        String hora = req.getParameter("hora");
        int clienteId = Integer.parseInt(req.getParameter("clienteId"));
        double total = Double.parseDouble(req.getParameter("total"));
        int productoFemeninoId = Integer.parseInt(req.getParameter("productoFemeninoId"));
        int productoMasculinoId = Integer.parseInt(req.getParameter("productoMasculinoId"));
        
        factura.add(fecha);
        factura.add(hora);
        factura.add(Integer.toString(clienteId));
        factura.add(Double.toString(total));
        factura.add(Integer.toString(productoFemeninoId));
        factura.add(Integer.toString(productoMasculinoId));
        
        req.setAttribute("factura", factura);
        req.setAttribute("mensaje", "¡¡Factura agregada con exito :D!!");
        getServletContext().getRequestDispatcher("facturas/formulario-facturas/formulario-facturas.jsp").forward(req, resp);
    }
}
