package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Direcciones;

public interface IDireccionService {
    public List<Direcciones> listarDireccion();
    
    public void agregarDireccion(Direcciones direccion);
    
    public void eliminarDireccion(int direccionId);
    
    public Direcciones buscarDireccion(int direccionId);
    
    public void editarDireccion(Direcciones direccion);
}