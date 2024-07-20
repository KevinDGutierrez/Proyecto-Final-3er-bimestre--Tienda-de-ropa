package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Direccion;

public interface IDireccionService {
    
    public List<Direccion> listarDirecciones();
    
    public void agregarDireccion(Direccion direccion);
    
    public void eliminarDireccion(int direccionId);
    
   public Direccion buscarDireccion(int direccionId);
    
   public void editarDireccion(Direccion direccion);
}


