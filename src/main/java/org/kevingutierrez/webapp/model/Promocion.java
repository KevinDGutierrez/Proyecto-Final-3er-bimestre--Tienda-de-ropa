/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kevingutierrez.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Table(name = "Promociones")
@Entity
/**
 *
 * @author kevin
 */
public class Promocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int promocionId;
    private double precioPromocion;
    private String descripcionPromocion;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private int productoFemeninoId;
    private int productoMasculinoId;

    public Promocion() {
    }

    public Promocion(double precioPromocion, String descripcionPromocion, Date fechaInicio, Date fechaFinalizacion, int productoFemeninoId, int productoMasculinoId) {
        this.precioPromocion = precioPromocion;
        this.descripcionPromocion = descripcionPromocion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.productoFemeninoId = productoFemeninoId;
        this.productoMasculinoId = productoMasculinoId;
    }

    public Promocion(int promocionId, double precioPromocion, String descripcionPromocion, Date fechaInicio, Date fechaFinalizacion, int productoFemeninoId, int productoMasculinoId) {
        this.promocionId = promocionId;
        this.precioPromocion = precioPromocion;
        this.descripcionPromocion = descripcionPromocion;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.productoFemeninoId = productoFemeninoId;
        this.productoMasculinoId = productoMasculinoId;
    }

    public int getPromocionId() {
        return promocionId;
    }

    public void setPromocionId(int promocionId) {
        this.promocionId = promocionId;
    }

    public double getPrecioPromocion() {
        return precioPromocion;
    }

    public void setPrecioPromocion(double precioPromocion) {
        this.precioPromocion = precioPromocion;
    }

    public String getDescripcionPromocion() {
        return descripcionPromocion;
    }

    public void setDescripcionPromocion(String descripcionPromocion) {
        this.descripcionPromocion = descripcionPromocion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
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
        return "Promocion{" + "promocionId=" + promocionId + ", precioPromocion=" + precioPromocion + ", descripcionPromocion=" + descripcionPromocion + ", fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", productoFemeninoId=" + productoFemeninoId + ", productoMasculinoId=" + productoMasculinoId + '}';
    }
    
    
}
