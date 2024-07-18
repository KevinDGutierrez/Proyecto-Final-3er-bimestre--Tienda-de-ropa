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
import org.ianalfaro.webapp.service.PromocionService;
import org.kevingutierrez.webapp.model.Promocion;

@WebServlet("/promocion-servlet")
@MultipartConfig
public class PromocionServlet extends HttpServlet{
    
    private PromocionService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new PromocionService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Promocion> promociones = ps.listarPromocion();
        req.setAttribute("promociones", promociones);
        req.getRequestDispatcher("promociones/listar-promociones/listar-promociones.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        ArrayList<String> promocion = new ArrayList<>();

        double precioPromocion = Double.parseDouble(req.getParameter("precioPromocion"));
        String descripcionPromocion = req.getParameter("descripcionPromocion");
        String fechaInicio = req.getParameter("fechaInicio");
        String fechaFinalizacion = req.getParameter("fechaFinalizacion");
        int productoFemeninoId = Integer.parseInt(req.getParameter("productoFemeninoId"));
        int productoMasculinoId = Integer.parseInt(req.getParameter("productoMasculinoId"));
        
        promocion.add(Double.toString(precioPromocion));
        promocion.add(descripcionPromocion);
        promocion.add(fechaInicio);
        promocion.add(fechaFinalizacion);
        promocion.add(Integer.toString(productoFemeninoId));
        promocion.add(Integer.toString(productoMasculinoId));
        
        req.setAttribute("promocion", promocion);
        req.setAttribute("mensaje", "¡¡Promocion agregado con exito :D!!");
        getServletContext().getRequestDispatcher("promociones/formulario-promociones/formulario-promociones.jsp").forward(req, resp);
    }
}