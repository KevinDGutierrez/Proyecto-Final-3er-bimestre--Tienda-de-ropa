package org.ianalfaro.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.ianalfaro.webapp.service.DetalleFacturaService;
import org.ianalfaro.webapp.model.DetalleFactura;

@WebServlet("/detalle-factura-servlet")
@MultipartConfig
public class DetalleFacturaServlet extends HttpServlet{
    
    private DetalleFacturaService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new DetalleFacturaService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DetalleFactura> detalleFacturas = ps.listarDetalleFactura();
        req.setAttribute("detalleFacturas", detalleFacturas);
        req.getRequestDispatcher("detalles-facturas/listar-detalles-facturas/listar-detalles-facturas.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarDetalleFactura(req, resp);
        }
    }
    
    public void agregarDetalleFactura(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int facturaId = Integer.parseInt(req.getParameter("facturaId"));
        int productoFemeninoId = Integer.parseInt(req.getParameter("productoFemeninoId"));
        int productoMasculinoId = Integer.parseInt(req.getParameter("productoMasculinoId"));
        
        ps.agregarDetalleFactura(new DetalleFactura(facturaId, productoFemeninoId, productoMasculinoId));
        
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
