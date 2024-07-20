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
import org.ianalfaro.webapp.service.PedidoService;
import org.kevingutierrez.webapp.model.Pedido;

@WebServlet("/pedido-servlet")
@MultipartConfig
public class PedidoServlet extends HttpServlet{
    
    private PedidoService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new PedidoService();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pedido> pedidos = ps.listarPedido();
        req.setAttribute("pedidos", pedidos);
        req.getRequestDispatcher("pedidos/listar-pedidos/listar-pedidos.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        
        ArrayList<String> pedido = new ArrayList<>();

        int clienteId = Integer.parseInt(req.getParameter("clienteId"));
        String fecha = req.getParameter("fecha");
        double total = Double.parseDouble(req.getParameter("total"));
        int direccionId = Integer.parseInt(req.getParameter("direccionId"));
        
        pedido.add(Integer.toString(clienteId));
        pedido.add(fecha);
        pedido.add(Double.toString(total));
        pedido.add(Integer.toString(direccionId));
        
        req.setAttribute("pedido", pedido);
        req.setAttribute("mensaje", "¡¡Pedido agregado con exito :D!!");
        getServletContext().getRequestDispatcher("pedidos/formulario-pedidos/formulario-pedidos.jsp").forward(req, resp);
    }
}