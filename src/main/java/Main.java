import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.kevingutierrez.webapp.model.Ciudad;
import org.pablocastillo.webapp.util.JpaUtil;

public class Main {
    
    private static EntityManager em = JpaUtil.getEntityManager();
    
    public static void main (String [] args){
        TypedQuery<Ciudad> query = em.createQuery("SELECT c FROM Ciudad c", Ciudad.class);
        
        List<Ciudad> ciudades = query.getResultList();
        
        for(Ciudad ciudad:ciudades){
            System.out.println(ciudad);
        }
    }
}
