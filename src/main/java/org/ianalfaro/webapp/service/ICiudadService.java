package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Ciudad;

public interface ICiudadService {
    public List<Ciudad> listarCiudad();
    
<<<<<<< HEAD
    public void agregarCiudad();
=======
  
    public void agregarCiudad(Ciudad ciudad);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarCiudad(int ciudadId);
    
    public Ciudad buscarCiudad(int ciudadId);
    
    public void editarCiudad(Ciudad ciudad);
}
