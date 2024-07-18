package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.ProductoFemeninos;

public interface IProductoFemeninoService {
    public List<ProductoFemeninos> listarProductoFemenino();
    
    public void agregarProductoFemenino();
    
    public void eliminarProductoFemenino(int productoFemeninoId);
    
    public ProductoFemeninos buscarProductoFemenino(int productoFemeninoId);
    
    public void editarProductoFemenino(ProductoFemeninos productoFemenino);
}
