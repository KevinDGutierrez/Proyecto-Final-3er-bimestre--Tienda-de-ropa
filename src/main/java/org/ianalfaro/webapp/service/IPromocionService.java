package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Promocion;

public interface IPromocionService {
    public List<Promocion> listarPromocion();
    
    public void agregarPromocion(Promocion promocion);
    
    public void eliminarPromocion(int promocionId);
    
    public Promocion buscarPromocion(int promocionId);
    
    public void editarPromocion(Promocion promocion);
}
