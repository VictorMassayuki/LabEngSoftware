package dao;

import model.Calculadora;
import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.List;

public class CalculadoraDaoImpl implements CalculadoraDao {


    @Override
    public void salvarConta(Double numeroUm, Double numeroDois, String operacao, Double resultado, Usuario usuario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora_web");
        EntityManager em = emf.createEntityManager();

        /* Criação de uma entidade - CREATE */
        Calculadora c1 = new Calculadora();
        c1.setNumeroUm(numeroUm);
        c1.setNumeroDois(numeroDois);
        c1.setOperacao(operacao);
        c1.setResultado(resultado);
        c1.setHorario(LocalDateTime.now());
        c1.setUsuario(usuario);

        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();
    }


    // Método que vai buscar no banco de dados todas as contas
    @Override
    public List<Calculadora> listarConta() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora_web");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT u FROM Calculadora u ");
        List<Calculadora> calculadoras = query.getResultList();

        return calculadoras;
    }
}
