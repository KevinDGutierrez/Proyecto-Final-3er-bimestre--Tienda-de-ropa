<<<<<<< HEAD
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoMasculinos;

<<<<<<< HEAD
public interface IProductoMasculinoService {
    public List<ProductoMasculinos> listarProductoMasculino();
    
    public void agregarProductoMasculino();
=======
/**
 *
 * @author aleja
 */
public interface IProductoMasculinoService {
    public List<ProductoMasculinos> listarProductoMasculino();
    
    public void agregarProductoMasculino(ProductoMasculinos productoMasculino);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarProductoMasculino(int productoMasculinoId);
    
    public ProductoMasculinos buscarProductoMasculino(int productoMasculinoId);
    
    public void editarProductoMasculino(ProductoMasculinos productoMasculino);
<<<<<<< HEAD
}
=======
}
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
