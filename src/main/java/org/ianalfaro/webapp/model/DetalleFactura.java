package org.ianalfaro.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "DetalleFacturas")
@Entity
public class DetalleFactura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detalleFacturaId;
    private int facturaId;
    private int productoFemeninoId;
    private int productoMasculinoId;
    
    public DetalleFactura(){
    
    }

    public DetalleFactura(int facturaId, int productoFemeninoId, int productoMasculinoId) {
        this.facturaId = facturaId;
        this.productoFemeninoId = productoFemeninoId;
        this.productoMasculinoId = productoMasculinoId;
    }

    public DetalleFactura(int detalleFacturaId, int facturaId, int productoFemeninoId, int productoMasculinoId) {
        this.detalleFacturaId = detalleFacturaId;
        this.facturaId = facturaId;
        this.productoFemeninoId = productoFemeninoId;
        this.productoMasculinoId = productoMasculinoId;
    }

    public int getDetalleFacturaId() {
        return detalleFacturaId;
    }

    public void setDetalleFacturaId(int detalleFacturaId) {
        this.detalleFacturaId = detalleFacturaId;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    public int getProductoFemeninoId() {
        return productoFemeninoId;
    }

    public void setProductoFemeninoId(int productoFemeninoId) {
        this.productoFemeninoId = productoFemeninoId;
    }

    public int getProductoMasculinoId() {
        return productoMasculinoId;
    }

    public void setProductoMasculinoId(int productoMasculinoId) {
        this.productoMasculinoId = productoMasculinoId;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "detalleFacturaId=" + detalleFacturaId + ", facturaId=" + facturaId + ", productoFemeninoId=" + productoFemeninoId + ", productoMasculinoId=" + productoMasculinoId + '}';
    }
}
