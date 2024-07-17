/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pablocastillo.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Table(name = "Facturas")
@Entity
/**
 *
 * @author kevin
 */
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facturaId;
    private Date fecha;
    private Time hora;
    private int clienteId;
    private double total;
    private int productoFemeninoId;
    private int productoMasculinoId;

    public Factura() {
    }

    public Factura(Date fecha, Time hora, int clienteId, double total, int productoFemeninoId, int productoMasculinoId) {
        this.fecha = fecha;
        this.hora = hora;
        this.clienteId = clienteId;
        this.total = total;
        this.productoFemeninoId = productoFemeninoId;
        this.productoMasculinoId = productoMasculinoId;
    }

    public Factura(int facturaId, Date fecha, Time hora, int clienteId, double total, int productoFemeninoId, int productoMasculinoId) {
        this.facturaId = facturaId;
        this.fecha = fecha;
        this.hora = hora;
        this.clienteId = clienteId;
        this.total = total;
        this.productoFemeninoId = productoFemeninoId;
        this.productoMasculinoId = productoMasculinoId;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
        return "Factura{" + "facturaId=" + facturaId + ", fecha=" + fecha + ", hora=" + hora + ", clienteId=" + clienteId + ", total=" + total + ", productoFemeninoId=" + productoFemeninoId + ", productoMasculinoId=" + productoMasculinoId + '}';
    }
    
    
}
