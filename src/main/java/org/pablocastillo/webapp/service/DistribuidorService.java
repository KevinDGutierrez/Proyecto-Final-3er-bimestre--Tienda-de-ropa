package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.alejandrocuxun.webapp.model.Distribuidores;
import org.pablocastillo.webapp.util.JpaUtil;

public class DistribuidorService implements IDistribuidorService{
 
    private EntityManager em;
 
    public DistribuidorService(){
        this.em = JpaUtil.getEntityManager();
 
    }

    @Override
    public List<Distribuidores> listarDistribuidor() {
        return em.createQuery("SELECT dt FROM Distribuidores dt", Distribuidores.class).getResultList();
    }

    @Override
    public void agregarDistribuidor(Distribuidores distribuidores) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(distribuidores);
            transaction.commit();
        }catch(Exception e) {
            if(transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarDistribuidor(int distribuidorId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Distribuidores buscarDistribuidor(int distribuidorId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarDistribuidor(Distribuidores distribuidor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}