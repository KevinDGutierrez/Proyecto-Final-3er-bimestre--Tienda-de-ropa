package org.pablocastillo.webapp.service;

import java.util.List;
import org.alejandrocuxun.webapp.model.CategoriaProductos;

public interface ICategoriaProductoService {
    public List<CategoriaProductos> listarCategoriaProducto();
    
<<<<<<< HEAD
    public void agregarCategoriaProducto();
=======
    public void agregarCategoriaProducto(CategoriaProductos categoriaProductos);
>>>>>>> fa8c694f5cba1a78e84d3283884f292293ffb260
    
    public void eliminarCategoriaProducto(int categoriaProductoId);
    
    public CategoriaProductos buscarCategoriaProducto(int categoriaProductoId);
    
    public void editarCategoriaProducto(CategoriaProductos categoriaProducto);
}
