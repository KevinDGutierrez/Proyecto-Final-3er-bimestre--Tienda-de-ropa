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
<<<<<<< HEAD
=======
import java.sql.Time;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260

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
<<<<<<< HEAD
=======
    private Time hora;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    private double total;
    private int direccionId;

    public Pedido() {
    }

<<<<<<< HEAD
    public Pedido(int clienteId, Date fecha, double total, int direccionId) {
        this.clienteId = clienteId;
        this.fecha = fecha;
=======
    public Pedido(int clienteId, Date fecha, Time hora, double total, int direccionId) {
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.hora = hora;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
        this.total = total;
        this.direccionId = direccionId;
    }

<<<<<<< HEAD
    public Pedido(int pedidoId, int clienteId, Date fecha, double total, int direccionId) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.fecha = fecha;
=======
    public Pedido(int pedidoId, int clienteId, Date fecha, Time hora, double total, int direccionId) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.hora = hora;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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

<<<<<<< HEAD
=======
    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
    
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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
<<<<<<< HEAD
        return "Pedido{" + "pedidoId=" + pedidoId + ", clienteId=" + clienteId + ", fecha=" + fecha + ", total=" + total + ", direccionId=" + direccionId + '}';
=======
        return "Pedido{" + "pedidoId=" + pedidoId + ", clienteId=" + clienteId + ", fecha=" + fecha + ", hora=" + hora + ", total=" + total + ", direccionId=" + direccionId + '}';
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    }
}
