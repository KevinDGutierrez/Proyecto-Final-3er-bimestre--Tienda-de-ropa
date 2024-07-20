package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Ciudad;

public interface ICiudadService {
    public List<Ciudad> listarCiudad();
    
  
    public void agregarCiudad(Ciudad ciudad);
    
    public void eliminarCiudad(int ciudadId);
    
    public Ciudad buscarCiudad(int ciudadId);
    
    public void editarCiudad(Ciudad ciudad);
}
