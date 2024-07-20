package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.Distribuidores;

public interface IDistribuidorService {
    public List<Distribuidores> listarDistribuidor();
    
    public void agregarDistribuidor();
    
    public void eliminarDistribuidor(int distribuidorId);
    
    public Distribuidores buscarDistribuidor(int distribuidorId);
    
    public void editarDistribuidor(Distribuidores distribuidor);
}