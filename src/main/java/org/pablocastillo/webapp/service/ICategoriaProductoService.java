package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.CategoriaProductos;

public interface ICategoriaProductoService {
    public List<CategoriaProductos> listarCategoriaProducto();
    
    public void agregarCategoriaProducto(CategoriaProductos categoriaProductos);
    
    public void eliminarCategoriaProducto(int categoriaProductoId);
    
    public CategoriaProductos buscarCategoriaProducto(int categoriaProductoId);
    
    public void editarCategoriaProducto(CategoriaProductos categoriaProducto);
}
