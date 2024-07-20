package org.ianalfaro.webapp.service;

import java.util.List;
import org.ianalfaro.webapp.model.DetallePedido;

public interface IDetallePedidoService {
    public List<DetallePedido> listarDetallePedido();
    
    public void agregarDetallePedido(DetallePedido detallePedido);
    
    public void eliminarDetallePedido(int detallePedidoId);
    
    public DetallePedido buscarDetallePedido(int detallePedidoId);
    
    public void editarDetallePedido(DetallePedido detallePedido);
}
