package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Clientes;

public interface IClienteService {
    public List<Clientes> listarCliente();
    
<<<<<<< HEAD
    public void agregarCliente();
=======
    public void agregarCliente(Clientes clientes);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarCliente(int clienteId);
    
    public Clientes buscarCliente(int clienteId);
    
    public void editarCategoriaProducto(Clientes cliente);
}