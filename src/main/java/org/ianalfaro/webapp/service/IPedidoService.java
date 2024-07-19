package org.ianalfaro.webapp.service;

import java.util.List;
import org.kevingutierrez.webapp.model.Pedido;

public interface IPedidoService {
    public List<Pedido> listarPedido();
    
    public void agregarPedido();
    
    public void eliminarPedido(int pedidoId);
    
    public Pedido buscarPedido(int pedidoId);
    
    public void editarPedido(Pedido pedido);
}
