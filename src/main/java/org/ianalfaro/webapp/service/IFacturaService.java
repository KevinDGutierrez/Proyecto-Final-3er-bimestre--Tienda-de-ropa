package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Factura;

public interface IFacturaService {
    public List<Factura> listarFactura();
    
    public void agregarFactura(Factura factura);
    
    public void eliminarFactura(int facturaId);
    
    public Factura buscarFactura(int facturaId);
    
    public void editarFactura(Factura factura);
}
