package org.ianalfaro.webapp.service;

import java.util.List;
import org.ianalfaro.webapp.model.DetalleFactura;

public interface IDetalleFacturaService {
    public List<DetalleFactura> listarDetalleFactura();
    
    public void agregarDetalleFactura(DetalleFactura detalleFactura);
    
    public void eliminarDetalleFactura(int detalleFacturaId);
    
    public DetalleFactura buscarDetalleFactura(int detalleFacturaId);
    
    public void editarDetalleFactura(DetalleFactura detalleFactura);
}
