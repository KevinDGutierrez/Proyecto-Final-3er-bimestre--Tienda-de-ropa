package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Pedido;

public interface IPedidoService {
    public List<Pedido> listarPedido();
    
<<<<<<< HEAD
    public void agregarPedido();
=======
    public void agregarPedido(Pedido pedido);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarPedido(int pedidoId);
    
    public Pedido buscarPedido(int pedidoId);
    
    public void editarPedido(Pedido pedido);
}
