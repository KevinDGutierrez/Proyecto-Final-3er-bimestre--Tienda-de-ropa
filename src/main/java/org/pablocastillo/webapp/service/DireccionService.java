package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
<<<<<<< HEAD
import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;
=======
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;
import org.kevingutierrez.webapp.model.Direccion;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
import org.pablocastillo.webapp.util.JpaUtil;

public class DireccionService implements IDireccionService{
 
    private EntityManager em;
 
    public DireccionService(){
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Direcciones> listarDireccion() {
         return em.createQuery("SELECT dr FROM Direcciones dr", Direcciones.class).getResultList();
    }

    @Override
<<<<<<< HEAD
    public void agregarDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
    public void agregarDireccion(Direcciones direccion) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(direccion);
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
    public void eliminarDireccion(int direccionId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Direcciones buscarDireccion(int direccionId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarDireccion(Direcciones direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
<<<<<<< HEAD
=======

    public void agregarDireccion(Direccion direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
}
    