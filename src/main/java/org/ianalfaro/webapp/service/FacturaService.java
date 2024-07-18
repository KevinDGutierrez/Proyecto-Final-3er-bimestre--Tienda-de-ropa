package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.kevingutierrez.webapp.model.Factura;
import org.pablocastillo.webapp.util.JpaUtil;

public class FacturaService implements IFacturaService{
    
    private EntityManager em;

    public FacturaService() {
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<Factura> listarFactura() {
        return em.createQuery("SELECT f FROM Factura f", Factura.class).getResultList();
    }

    @Override
    public void agregarFactura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarFactura(int facturaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Factura buscarFactura(int facturaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
