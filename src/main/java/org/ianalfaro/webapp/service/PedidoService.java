package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.kevingutierrez.webapp.model.Pedido;
import org.pablocastillo.webapp.util.JpaUtil;

public class PedidoService implements IPedidoService{
    
    private EntityManager em;

    public PedidoService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Pedido> listarPedido() {
        return em.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
    }

    @Override
    public void agregarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarPedido(int pedidoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pedido buscarPedido(int pedidoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
