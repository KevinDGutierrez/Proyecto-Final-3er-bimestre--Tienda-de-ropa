package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Distribuidores;

public interface IDistribuidorService {
    public List<Distribuidores> listarDistribuidor();
    
<<<<<<< HEAD
    public void agregarDistribuidor();
=======
    public void agregarDistribuidor(Distribuidores distribuidores);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarDistribuidor(int distribuidorId);
    
    public Distribuidores buscarDistribuidor(int distribuidorId);
    
    public void editarDistribuidor(Distribuidores distribuidor);
}