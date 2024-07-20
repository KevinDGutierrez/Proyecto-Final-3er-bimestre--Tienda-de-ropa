package org.alejandrocuxun.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "CategoriaProductos")
@Entity
public class CategoriaProductos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoriaProductoId")
    private int categoriaProductosId;
    private String nombreCategoria;
    private String descripcionCategoria;

    public CategoriaProductos() {
    }

    public CategoriaProductos(String nombreCategoria, String descripcionCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public CategoriaProductos(int categoriaProductosId, String nombreCategoria, String descripcionCategoria) {
        this.categoriaProductosId = categoriaProductosId;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public int getCategoriaProductosId() {
        return categoriaProductosId;
    }

    public void setCategoriaProductosId(int categoriaProductosId) {
        this.categoriaProductosId = categoriaProductosId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    @Override
    public String toString() {
        return "CategoriaProductos{" + "categoriaProductosId=" + categoriaProductosId + ", nombreCategoria=" + nombreCategoria + ", descripcionCategoria=" + descripcionCategoria + '}';
    }
}