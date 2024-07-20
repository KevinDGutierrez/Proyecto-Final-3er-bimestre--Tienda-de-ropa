package org.alejandrocuxun.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Blob;

@Table(name = "ProductosFemeninos")
@Entity
public class ProductoFemeninos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoFemeninoId;
    private String nombreProducto;
    private double precioCompra;
    private String descripcionProducto;
    private int cantidadStock;
    private double precioVentaUnitario;
    private Blob imagenProducto;
    private int distribuidorId;
    private int categoriaProductoId;

    public ProductoFemeninos() {
    }

    public ProductoFemeninos(String nombreProducto, double precioCompra, String descripcionProducto, int cantidadStock, double precioVentaUnitario, Blob imagenProducto, int distribuidorId, int categoriaProductoId) {
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.descripcionProducto = descripcionProducto;
        this.cantidadStock = cantidadStock;
        this.precioVentaUnitario = precioVentaUnitario;
        this.imagenProducto = imagenProducto;
        this.distribuidorId = distribuidorId;
        this.categoriaProductoId = categoriaProductoId;
    }

    public ProductoFemeninos(int productoFemeninoId, String nombreProducto, double precioCompra, String descripcionProducto, int cantidadStock, double precioVentaUnitario, Blob imagenProducto, int distribuidorId, int categoriaProductoId) {
        this.productoFemeninoId = productoFemeninoId;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.descripcionProducto = descripcionProducto;
        this.cantidadStock = cantidadStock;
        this.precioVentaUnitario = precioVentaUnitario;
        this.imagenProducto = imagenProducto;
        this.distribuidorId = distribuidorId;
        this.categoriaProductoId = categoriaProductoId;
    }

    public ProductoFemeninos(String nombreProducto, double precioCompra, String descripcionProducto, int cantidadStock, double precioVentaUnitario, int distribuidorId, int categoriaProductoId) {
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.descripcionProducto = descripcionProducto;
        this.cantidadStock = cantidadStock;
        this.precioVentaUnitario = precioVentaUnitario;
        this.distribuidorId = distribuidorId;
        this.categoriaProductoId = categoriaProductoId;
    }

    public int getProductoFemeninoId() {
        return productoFemeninoId;
    }

    public void setProductoFemeninoId(int productoFemeninoId) {
        this.productoFemeninoId = productoFemeninoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }

    public void setPrecioVentaUnitario(double precioVentaUnitario) {
        this.precioVentaUnitario = precioVentaUnitario;
    }

    public Blob getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(Blob imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public int getDistribuidorId() {
        return distribuidorId;
    }

    public void setDistribuidorId(int distribuidorId) {
        this.distribuidorId = distribuidorId;
    }

    public int getCategoriaProductoId() {
        return categoriaProductoId;
    }

    public void setCategoriaProductoId(int categoriaProductoId) {
        this.categoriaProductoId = categoriaProductoId;
    }

    @Override
    public String toString() {
        return "ProductoFemeninos{" + "productoFemeninoId=" + productoFemeninoId + ", nombreProducto=" + nombreProducto + ", precioCompra=" + precioCompra + ", descripcionProducto=" + descripcionProducto + ", cantidadStock=" + cantidadStock + ", precioVentaUnitario=" + precioVentaUnitario + ", imagenProducto=" + imagenProducto + ", distribuidorId=" + distribuidorId + ", categoriaproductoId=" + categoriaProductoId + '}';
    }
}
