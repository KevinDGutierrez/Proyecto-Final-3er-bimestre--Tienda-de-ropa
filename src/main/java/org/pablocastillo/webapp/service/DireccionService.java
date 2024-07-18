package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;
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
    public void agregarDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
}
    