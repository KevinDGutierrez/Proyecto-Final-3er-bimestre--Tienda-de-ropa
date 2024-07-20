package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Factura;

public interface IFacturaService {
    public List<Factura> listarFactura();
    
<<<<<<< HEAD
    public void agregarFactura();
=======
    public void agregarFactura(Factura factura);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarFactura(int facturaId);
    
    public Factura buscarFactura(int facturaId);
    
    public void editarFactura(Factura factura);
}
