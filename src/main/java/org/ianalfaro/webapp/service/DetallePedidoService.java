package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.ianalfaro.webapp.model.DetallePedido;
import org.pablocastillo.webapp.util.JpaUtil;

public class DetallePedidoService implements IDetallePedidoService{
    
    private EntityManager em;

    public DetallePedidoService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<DetallePedido> listarDetallePedido() {
        return em.createQuery("SELECT dp FROM DetallePedido dp", DetallePedido.class).getResultList();
    }

    @Override
    public void agregarDetallePedido(DetallePedido detallePedido) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(detallePedido);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
        em.persist(detallePedido);
    }

    @Override
    public void eliminarDetallePedido(int detallePedidoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DetallePedido buscarDetallePedido(int detallePedidoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarDetallePedido(DetallePedido detallePedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
