package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.alejandrocuxun.webapp.model.CategoriaProductos;
import org.pablocastillo.webapp.util.JpaUtil;

public class CategoriaProductoService implements ICategoriaProductoService {
 
    private EntityManager em;
 
    public CategoriaProductoService(){
        this.em = JpaUtil.getEntityManager();
    }

    @Override
    public List<CategoriaProductos> listarCategoriaProducto() {
        return em.createQuery("SELECT cp FROM CategoriaProductos cp" , CategoriaProductos.class).getResultList();
    }

    @Override
    public void agregarCategoriaProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarCategoriaProducto(int categoriaProductoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoriaProductos buscarCategoriaProducto(int categoriaProductoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarCategoriaProducto(CategoriaProductos categoriaProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
