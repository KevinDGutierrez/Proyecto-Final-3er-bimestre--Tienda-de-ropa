package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoMasculinos;
import org.pablocastillo.webapp.util.JpaUtil;

public class ProductoMasculinoService implements IProductoMasculinoService{
 
    private EntityManager em;
 
    public ProductoMasculinoService(){
        this.em = JpaUtil.getEntityManager();
 
    }

    @Override
    public List<ProductoMasculinos> listarProductoMasculino() {
       return em.createQuery("SELECT pm FROM ProductoMasculinos pm", ProductoMasculinos.class).getResultList();
    }

    public void agregarProductoMasculino(ProductoMasculinos productoMasculino) {
       EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(productoMasculino);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        } 
    }

    @Override
    public void eliminarProductoMasculino(int productoMasculinoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductoMasculinos buscarProductoMasculino(int productoMasculinoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarProductoMasculino(ProductoMasculinos productoMasculino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}