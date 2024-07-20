package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
<<<<<<< HEAD
=======
import jakarta.persistence.EntityTransaction;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
import java.util.List;
import org.kevingutierrez.webapp.model.Ciudad;
import org.pablocastillo.webapp.util.JpaUtil;

public class CiudadService implements ICiudadService{
    
<<<<<<< HEAD
    private EntityManager em;
=======
    private final EntityManager em;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260

    public CiudadService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Ciudad> listarCiudad() {
        return em.createQuery("SELECT c FROM Ciudad c", Ciudad.class).getResultList();
    }

<<<<<<< HEAD
    @Override
    public void agregarCiudad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
    
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
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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
<<<<<<< HEAD
=======

    

    
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
}
