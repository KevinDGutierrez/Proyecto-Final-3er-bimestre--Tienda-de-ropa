<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
package org.alejandrocuxun.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Blob;

<<<<<<< HEAD
/**
 *
 * @author aleja
 */
@Table(name = "ProductosFemeninos")
@Entity
public class ProductoFemeninos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int productoFemeninoId;
=======
@Table(name = "ProductosFemeninos")
@Entity
public class ProductoFemeninos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoFemeninoId;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    private String nombreProducto;
    private double precioCompra;
    private String descripcionProducto;
    private int cantidadStock;
    private double precioVentaUnitario;
    private Blob imagenProducto;
    private int distribuidorId;
<<<<<<< HEAD
    private int categoriaproductoId;
=======
    private int categoriaProductoId;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260

    public ProductoFemeninos() {
    }

<<<<<<< HEAD
    public ProductoFemeninos(int productoFemeninoId, String nombreProducto, double precioCompra, String descripcionProducto, int cantidadStock, double precioVentaUnitario, Blob imagenProducto, int distribuidorId, int categoriaproductoId) {
=======
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
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
        this.productoFemeninoId = productoFemeninoId;
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.descripcionProducto = descripcionProducto;
        this.cantidadStock = cantidadStock;
        this.precioVentaUnitario = precioVentaUnitario;
        this.imagenProducto = imagenProducto;
        this.distribuidorId = distribuidorId;
<<<<<<< HEAD
        this.categoriaproductoId = categoriaproductoId;
    }

    public ProductoFemeninos(String nombreProducto, double precioCompra, String descripcionProducto, int cantidadStock, double precioVentaUnitario, Blob imagenProducto, int distribuidorId, int categoriaproductoId) {
=======
        this.categoriaProductoId = categoriaProductoId;
    }

    public ProductoFemeninos(String nombreProducto, double precioCompra, String descripcionProducto, int cantidadStock, double precioVentaUnitario, int distribuidorId, int categoriaProductoId) {
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
        this.nombreProducto = nombreProducto;
        this.precioCompra = precioCompra;
        this.descripcionProducto = descripcionProducto;
        this.cantidadStock = cantidadStock;
        this.precioVentaUnitario = precioVentaUnitario;
<<<<<<< HEAD
        this.imagenProducto = imagenProducto;
        this.distribuidorId = distribuidorId;
        this.categoriaproductoId = categoriaproductoId;
=======
        this.distribuidorId = distribuidorId;
        this.categoriaProductoId = categoriaProductoId;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    }

    public int getProductoFemeninoId() {
        return productoFemeninoId;
    }

<<<<<<< HEAD
    public void setpProductoFemeninoId(int productoFemeninoId) {
=======
    public void setProductoFemeninoId(int productoFemeninoId) {
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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

<<<<<<< HEAD
    public int getCategoriaproductoId() {
        return categoriaproductoId;
    }

    public void setCategoriaproductoId(int categoriaproductoId) {
        this.categoriaproductoId = categoriaproductoId;
=======
    public int getCategoriaProductoId() {
        return categoriaProductoId;
    }

    public void setCategoriaProductoId(int categoriaProductoId) {
        this.categoriaProductoId = categoriaProductoId;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "ProductosFemeninos{" + "productoFemeninoId=" + productoFemeninoId + ", nombreProducto=" + nombreProducto + ", precioCompra=" + precioCompra + ", descripcionProducto=" + descripcionProducto + ", cantidadStock=" + cantidadStock + ", precioVentaUnitario=" + precioVentaUnitario + ", imagenProducto=" + imagenProducto + ", distribuidorId=" + distribuidorId + ", categoriaproductoId=" + categoriaproductoId + '}';
=======
        return "ProductoFemeninos{" + "productoFemeninoId=" + productoFemeninoId + ", nombreProducto=" + nombreProducto + ", precioCompra=" + precioCompra + ", descripcionProducto=" + descripcionProducto + ", cantidadStock=" + cantidadStock + ", precioVentaUnitario=" + precioVentaUnitario + ", imagenProducto=" + imagenProducto + ", distribuidorId=" + distribuidorId + ", categoriaproductoId=" + categoriaProductoId + '}';
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    }
}
