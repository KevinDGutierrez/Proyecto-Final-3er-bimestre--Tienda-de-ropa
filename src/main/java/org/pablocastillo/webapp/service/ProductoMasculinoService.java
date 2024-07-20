package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
<<<<<<< HEAD
=======
import jakarta.persistence.EntityTransaction;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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

<<<<<<< HEAD
    @Override
    public void agregarProductoMasculino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
=======
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
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
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
<<<<<<< HEAD
    
    
=======
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
}