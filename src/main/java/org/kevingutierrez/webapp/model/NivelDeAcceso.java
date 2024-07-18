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

@Table(name = "NivelesAcceso")
@Entity
/**
 *
 * @author kevin
 */
public class NivelDeAcceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nivelAccesoId;
    private String nivelAcceso;

    public NivelDeAcceso() {
    }

    public NivelDeAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public NivelDeAcceso(int nivelAccesoId, String nivelAcceso) {
        this.nivelAccesoId = nivelAccesoId;
        this.nivelAcceso = nivelAcceso;
    }

    public int getNivelAccesoId() {
        return nivelAccesoId;
    }

    public void setNivelAccesoId(int nivelAccesoId) {
        this.nivelAccesoId = nivelAccesoId;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "NivelDeAcceso{" + "nivelAccesoId=" + nivelAccesoId + ", nivelAcceso=" + nivelAcceso + '}';
    }
    
    
}
