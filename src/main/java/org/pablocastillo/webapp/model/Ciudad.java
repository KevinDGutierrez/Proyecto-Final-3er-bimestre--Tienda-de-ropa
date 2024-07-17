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

@Table(name = "Ciudades")
@Entity
/**
 *
 * @author kevin
 */
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ciudadId;
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Ciudad(int ciudadId, String nombreCiudad) {
        this.ciudadId = ciudadId;
        this.nombreCiudad = nombreCiudad;
    }

    public int getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(int ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ciudadId=" + ciudadId + ", nombreCiudad=" + nombreCiudad + '}';
    }
    
    
}
