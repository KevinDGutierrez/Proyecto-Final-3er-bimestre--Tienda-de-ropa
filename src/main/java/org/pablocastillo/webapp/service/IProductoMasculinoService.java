/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoMasculinos;

/**
 *
 * @author aleja
 */
public interface IProductoMasculinoService {
    public List<ProductoMasculinos> listarProductoMasculino();
    
    public void agregarProductoMasculino(ProductoMasculinos productoMasculino);
    
    public void eliminarProductoMasculino(int productoMasculinoId);
    
    public ProductoMasculinos buscarProductoMasculino(int productoMasculinoId);
    
    public void editarProductoMasculino(ProductoMasculinos productoMasculino);
}
