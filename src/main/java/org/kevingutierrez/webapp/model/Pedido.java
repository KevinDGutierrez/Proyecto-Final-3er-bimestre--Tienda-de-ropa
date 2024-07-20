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
    private int direccionId;

    public Pedido() {
    }

    public Pedido(int clienteId, Date fecha, double total, int direccionId) {
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.total = total;
        this.direccionId = direccionId;
    }

    public Pedido(int pedidoId, int clienteId, Date fecha, double total, int direccionId) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.total = total;
        this.direccionId = direccionId;
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

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    @Override
    public String toString() {
        return "Pedido{" + "pedidoId=" + pedidoId + ", clienteId=" + clienteId + ", fecha=" + fecha + ", total=" + total + ", direccionId=" + direccionId + '}';
    }
}
