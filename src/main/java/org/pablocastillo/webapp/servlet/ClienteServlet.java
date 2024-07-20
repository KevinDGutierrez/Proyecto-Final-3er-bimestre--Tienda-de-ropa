package org.pablocastillo.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
import java.util.List;
import org.alejandrocuxun.webapp.model.Clientes;
import org.pablocastillo.webapp.service.ClienteService;

@WebServlet("/cliente-servlet")
@MultipartConfig
public class ClienteServlet extends HttpServlet {

    private ClienteService ps;
    
    @Override
    public void init() throws ServletException{
        super.init();
        this.ps = new ClienteService();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Clientes> clientes = ps.listarCliente();
        req.setAttribute("clientes", clientes);
        req.getRequestDispatcher("clientes/listar-clientes/listar-clientes.jsp").forward(req, resp);
    }

<<<<<<< HEAD
=======
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
    
        if(path == null || path.equals("/")) {
            agregarCliente(req, resp);
        }
    }
    
    public void agregarCliente(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        int direccionId = Integer.parseInt(req.getParameter("direccionId"));
        
        ps.agregarCliente(new Clientes(nombre, apellido, direccionId));
        
        resp.sendRedirect(req.getContextPath() + "/");
    }

    
    
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    
}