import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Usuario;

public class Main {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora_web");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario();
        usuario.setNome("massa");
        usuario.setSenha("1234");

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
}
