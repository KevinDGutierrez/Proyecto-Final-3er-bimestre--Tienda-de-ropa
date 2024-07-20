<<<<<<< HEAD
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoFemeninos;

<<<<<<< HEAD
=======
/**
 *
 * @author aleja
 */
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
public interface IProductoFemeninoService {
    public List<ProductoFemeninos> listarProductoFemenino();
    
    public void agregarProductoFemenino();
    
    public void eliminarProductoFemenino(int productoFemeninoId);
    
    public ProductoFemeninos buscarProductoFemenino(int productoFemeninoId);
    
    public void editarProductoFemenino(ProductoFemeninos productoFemenino);
}
