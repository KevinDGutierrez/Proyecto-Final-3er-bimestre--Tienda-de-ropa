package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;

public interface IDireccionService {
    public List<Direcciones> listarDireccion();
    
<<<<<<< HEAD
    public void agregarDireccion();
=======
    public void agregarDireccion(Direcciones direccion);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarDireccion(int direccionId);
    
    public Direcciones buscarDireccion(int direccionId);
    
    public void editarDireccion(Direcciones direccion);
}