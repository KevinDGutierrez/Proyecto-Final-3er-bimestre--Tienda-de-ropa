
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.alejandrocuxun.webapp.model.CategoriaProductos;
import org.pablocastillo.webapp.util.JpaUtil;

public class Main {
    
    private static EntityManager em = JpaUtil.getEntityManager();
    public static void main (String [] args){
        TypedQuery<CategoriaProductos> query = em.createQuery("SELECT cp FROM CategoriaProductos cp", CategoriaProductos.class);
        List <CategoriaProductos> categoriaProductos =  query.getResultList();
        
        categoriaProductos.forEach(categoriaProducto -> System.out.println(categoriaProducto));
    }
    
    
    
    
}
