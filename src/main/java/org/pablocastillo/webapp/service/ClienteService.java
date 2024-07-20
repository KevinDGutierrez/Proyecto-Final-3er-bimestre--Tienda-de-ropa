package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.alejandrocuxun.webapp.model.Clientes;
import org.pablocastillo.webapp.util.JpaUtil;

public class ClienteService implements IClienteService{
 
    private EntityManager em;
 
    public ClienteService(){
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Clientes> listarCliente() {
        return em.createQuery("SELECT cl FROM Clientes cl", Clientes.class).getResultList();
    }

    @Override
    public void agregarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarCliente(int clienteId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Clientes buscarCliente(int clienteId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarCategoriaProducto(Clientes cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}