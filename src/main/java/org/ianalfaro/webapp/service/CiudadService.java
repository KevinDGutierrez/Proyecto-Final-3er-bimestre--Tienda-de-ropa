package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.kevingutierrez.webapp.model.Ciudad;
import org.pablocastillo.webapp.util.JpaUtil;

public class CiudadService implements ICiudadService{
    
    private EntityManager em;

    public CiudadService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Ciudad> listarCiudad() {
        return em.createQuery("SELECT c FROM Ciudad c", Ciudad.class).getResultList();
    }

    @Override
    public void agregarCiudad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
