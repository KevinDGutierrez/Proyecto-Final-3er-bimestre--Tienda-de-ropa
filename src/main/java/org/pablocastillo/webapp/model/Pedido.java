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

@Table(name = "Pedidos")
@Entity
/**
 *
 * @author kevin
 */
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pedidoId;
    private int clienteId;
    private Date fecha;
    private double total;
    private String direccionEntrega;

    public Pedido() {
    }

    public Pedido(int clienteId, Date fecha, double total, String direccionEntrega) {
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.total = total;
        this.direccionEntrega = direccionEntrega;
    }

    public Pedido(int pedidoId, int clienteId, Date fecha, double total, String direccionEntrega) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.total = total;
        this.direccionEntrega = direccionEntrega;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" + "pedidoId=" + pedidoId + ", clienteId=" + clienteId + ", fecha=" + fecha + ", total=" + total + ", direccionEntrega=" + direccionEntrega + '}';
    }
}
