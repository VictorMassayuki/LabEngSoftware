package dao;

import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginDaoImpl implements LoginDao {

    @Override
    public Usuario buscarUsuario(String nome, String senha) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora_web");
        EntityManager em = emf.createEntityManager();


        Query query = em.createQuery("SELECT u FROM Usuario u WHERE nome = :nome AND senha = :senha")
                .setParameter("nome", nome)
                .setParameter("senha", senha);

        Usuario usuario = (Usuario) query.getSingleResult();

        return usuario;
    }
}
