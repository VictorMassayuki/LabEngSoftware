package dao;

import model.Calculadora;
import model.Usuario;

import java.util.List;

public interface CalculadoraDao {

    void salvarConta(Double numeroUm,
                            Double numeroDois,
                            String operacao,
                            Double resultado,
                            Usuario usuario
                     );

    List<Calculadora> listarConta();

}
