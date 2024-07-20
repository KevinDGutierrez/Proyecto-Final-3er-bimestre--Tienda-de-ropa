package org.pablocastillo.webapp.service;

import jakarta.persistence.EntityManager;
<<<<<<< HEAD
=======
import jakarta.persistence.EntityTransaction;
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoFemeninos;
import org.pablocastillo.webapp.util.JpaUtil;

public class ProductoFemeninoService implements IProductoFemeninoService{
 
    private EntityManager em;
 
    public ProductoFemeninoService(){
        this.em = JpaUtil.getEntityManager();
 
    }

    @Override
    public List<ProductoFemeninos> listarProductoFemenino() {
        return em.createQuery("SELECT pf FROM ProductoFemeninos pf", ProductoFemeninos.class).getResultList();
    }

<<<<<<< HEAD
=======
    public void agregarProductoFemenino(ProductoFemeninos productoFemeninos) {
        EntityTransaction transaction = em.getTransaction();
        
        try{
            transaction.begin();
            em.persist(productoFemeninos);
            transaction.commit();
        }catch(Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    @Override
    public void agregarProductoFemenino() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarProductoFemenino(int productoFemeninoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductoFemeninos buscarProductoFemenino(int productoFemeninoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarProductoFemenino(ProductoFemeninos productoFemenino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
<<<<<<< HEAD
    
    
=======
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
}