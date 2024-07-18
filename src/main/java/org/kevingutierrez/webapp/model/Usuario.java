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

@Table(name = "Usuarios")
@Entity
/**
 *
 * @author kevin
 */
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioId;
    private String usuario;
    private String contrasenia;
    private int nivelAccesoId;

    public Usuario() {
    }

    public Usuario(int usuarioId, String usuario, String contrasenia, int nivelAccesoId) {
        this.usuarioId = usuarioId;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nivelAccesoId = nivelAccesoId;
    }

    public Usuario(String usuario, String contrasenia, int nivelAccesoId) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nivelAccesoId = nivelAccesoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getNivelAccesoId() {
        return nivelAccesoId;
    }

    public void setNivelAccesoId(int nivelAccesoId) {
        this.nivelAccesoId = nivelAccesoId;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "usuarioId=" + usuarioId + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", nivelAccesoId=" + nivelAccesoId + '}';
    }
}
