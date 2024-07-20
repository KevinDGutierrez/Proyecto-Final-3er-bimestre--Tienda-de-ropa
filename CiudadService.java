package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.kevingutierrez.webapp.model.Ciudad;
import org.pablocastillo.webapp.util.JpaUtil;

public class CiudadService implements ICiudadService{
    
    private final EntityManager em;

    public CiudadService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Ciudad> listarCiudad() {
        return em.createQuery("SELECT c FROM Ciudad c", Ciudad.class).getResultList();
    }

    
   @Override
    public void agregarCiudad(Ciudad ciudad) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(ciudad);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarCiudad(int ciudadId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ciudad buscarCiudad(int ciudadId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
}
