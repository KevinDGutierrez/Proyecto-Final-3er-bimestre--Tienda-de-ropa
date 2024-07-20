package org.ianalfaro.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
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
        
        
        
        //Aregar Kevin
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarPromocion(req, resp);
        }else{
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    
    public void agregarPromocion(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Double precioPromocion = Double.parseDouble(req.getParameter("precioPromocion"));
            String descripcionPromocion = req.getParameter("descripcionPromocion");
            Date fechaInicio = Date.valueOf(req.getParameter("fechaInicio"));
            Date fechaFinalizacion = Date.valueOf(req.getParameter("fechaFinalizacion"));
            int productoFemeninoId = Integer.parseInt(req.getParameter("productoFemeninoId"));
            int productoMasculinoId = Integer.parseInt(req.getParameter("productoMasculinoId"));
            
            ps.agregarPromocion(new Promocion(precioPromocion, descripcionPromocion, fechaInicio, fechaFinalizacion, productoFemeninoId, productoMasculinoId));
            
            //resp.sendRedirect("/KinalShop/index.jsp");
            resp.sendRedirect(req.getContextPath() + "/");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}