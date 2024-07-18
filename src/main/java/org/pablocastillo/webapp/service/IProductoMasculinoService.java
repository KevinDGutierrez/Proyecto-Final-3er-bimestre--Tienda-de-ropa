package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoMasculinos;

public interface IProductoMasculinoService {
    public List<ProductoMasculinos> listarProductoMasculino();
    
    public void agregarProductoMasculino();
    
    public void eliminarProductoMasculino(int productoMasculinoId);
    
    public ProductoMasculinos buscarProductoMasculino(int productoMasculinoId);
    
    public void editarProductoMasculino(ProductoMasculinos productoMasculino);
}