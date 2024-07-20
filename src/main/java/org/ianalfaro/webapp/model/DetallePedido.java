package org.ianalfaro.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "DetallePedidos")
@Entity
public class DetallePedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detallePedidoId;
    private int cantidadComprada;
    private int productoMasculinoId;
    private int productoFemeninoId;
    private int pedidoId;
    
    public DetallePedido(){
    
    }

    public DetallePedido(int cantidadComprada, int productoMasculinoId, int productoFemeninoId, int pedidoId) {
        this.cantidadComprada = cantidadComprada;
        this.productoMasculinoId = productoMasculinoId;
        this.productoFemeninoId = productoFemeninoId;
        this.pedidoId = pedidoId;
    }

    public DetallePedido(int detallePedidoId, int cantidadComprada, int productoMasculinoId, int productoFemeninoId, int pedidoId) {
        this.detallePedidoId = detallePedidoId;
        this.cantidadComprada = cantidadComprada;
        this.productoMasculinoId = productoMasculinoId;
        this.productoFemeninoId = productoFemeninoId;
        this.pedidoId = pedidoId;
    }

    public int getDetallePedidoId() {
        return detallePedidoId;
    }

    public void setDetallePedidoId(int detallePedidoId) {
        this.detallePedidoId = detallePedidoId;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public int getProductoMasculinoId() {
        return productoMasculinoId;
    }

    public void setProductoMasculinoId(int productoMasculinoId) {
        this.productoMasculinoId = productoMasculinoId;
    }

    public int getProductoFemeninoId() {
        return productoFemeninoId;
    }

    public void setProductoFemeninoId(int productoFemeninoId) {
        this.productoFemeninoId = productoFemeninoId;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "detallePedidoId=" + detallePedidoId + ", cantidadComprada=" + cantidadComprada + ", productoMasculinoId=" + productoMasculinoId + ", productoFemeninoId=" + productoFemeninoId + ", pedidoId=" + pedidoId + '}';
    }
}
