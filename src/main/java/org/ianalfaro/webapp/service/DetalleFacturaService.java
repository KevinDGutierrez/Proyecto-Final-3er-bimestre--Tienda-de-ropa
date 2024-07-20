package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.ianalfaro.webapp.model.DetalleFactura;
import org.pablocastillo.webapp.util.JpaUtil;

public class DetalleFacturaService implements IDetalleFacturaService{

    private EntityManager em;

    public DetalleFacturaService() {
        this.em = JpaUtil.getEntityManager();
    }
    
    @Override
    public List<DetalleFactura> listarDetalleFactura() {
        return em.createQuery("SELECT df FROM DetalleFactura df", DetalleFactura.class).getResultList();
    }

    @Override
    public void agregarDetalleFactura(DetalleFactura detalleFactura) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(detalleFactura);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
        em.persist(detalleFactura);
    }

    @Override
    public void eliminarDetalleFactura(int detalleFacturaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DetalleFactura buscarDetalleFactura(int detalleFacturaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarDetalleFactura(DetalleFactura detalleFactura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
