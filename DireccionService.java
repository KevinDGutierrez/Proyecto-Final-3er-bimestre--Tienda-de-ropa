package org.ianalfaro.webapp.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;
import org.kevingutierrez.webapp.model.Direccion;
import org.pablocastillo.webapp.util.JpaUtil;

public class DireccionService {

    private final EntityManager em;

    public DireccionService() {
        this.em = JpaUtil.getEntityManager();
    }

    // Listar todas las direcciones
    public List<Direccion> listarDirecciones() {
throw new UnsupportedOperationException("Not supported yet.");    }

    // Agregar una nueva dirección
    public void agregarDireccion(Direccion direccion) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(direccion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // Eliminar una dirección por ID
    public void eliminarDireccion(int direccionId) {
       throw new UnsupportedOperationException("Not supported yet.");
        
    }

    // Buscar una dirección por ID
    public Direccion buscarDireccion(int direccionId) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        
    }

    // Editar una dirección existente
    public void editarDireccion(Direccion direccion) {
      throw new UnsupportedOperationException("Not supported yet.");
}

}