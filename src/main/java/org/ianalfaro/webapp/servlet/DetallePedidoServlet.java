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
import org.ianalfaro.webapp.service.DetallePedidoService;
import org.ianalfaro.webapp.model.DetallePedido;

@WebServlet("/detalle-pedido-servlet")
@MultipartConfig
public class DetallePedidoServlet extends HttpServlet{
    
    private DetallePedidoService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new DetallePedidoService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DetallePedido> detallePedidos = ps.listarDetallePedido();
        req.setAttribute("detallePedidos", detallePedidos);
        req.getRequestDispatcher("detalles-pedidos/listar-detalles-pedidos/listar-detalles-pedidos.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String path = req.getPathInfo();
        
        if(path == null || path.equals("/")){
            agregarDetallePedido(req, resp);
        }
    }
    
    public void agregarDetallePedido(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int cantidadComprada = Integer.parseInt(req.getParameter("cantidadComprada"));
        int productoMasculinoId = Integer.parseInt(req.getParameter("productoMasculinoId"));
        int productoFemeninoId = Integer.parseInt(req.getParameter("productoFemeninoId"));
        int pedidoId = Integer.parseInt(req.getParameter("pedidoId"));
        
        
        ps.agregarDetallePedido(new DetallePedido(cantidadComprada, productoFemeninoId, productoMasculinoId, pedidoId));
        
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }
}
