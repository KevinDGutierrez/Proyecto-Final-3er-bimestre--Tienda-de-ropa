package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.kevingutierrez.webapp.model.Promocion;
import org.pablocastillo.webapp.util.JpaUtil;

public class PromocionService implements IPromocionService{
    
    private EntityManager em;

    public PromocionService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Promocion> listarPromocion() {
        return em.createQuery("SELECT pm FROM Promocion pm", Promocion.class).getResultList();
    }

    @Override
    public void agregarPromocion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarPromocion(int promocionId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Promocion buscarPromocion(int promocionId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarPromocion(Promocion promocion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
