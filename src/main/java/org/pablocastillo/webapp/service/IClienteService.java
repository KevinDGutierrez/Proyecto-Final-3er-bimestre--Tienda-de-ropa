package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Clientes;

public interface IClienteService {
    public List<Clientes> listarCliente();
    
    public void agregarCliente();
    
    public void eliminarCliente(int clienteId);
    
    public Clientes buscarCliente(int clienteId);
    
    public void editarCategoriaProducto(Clientes cliente);
}