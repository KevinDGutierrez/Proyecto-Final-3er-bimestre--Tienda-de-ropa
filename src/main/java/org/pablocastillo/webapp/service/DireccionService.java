package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;
import org.kevingutierrez.webapp.model.Direccion;
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

    public void agregarDireccion(Direccion direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    