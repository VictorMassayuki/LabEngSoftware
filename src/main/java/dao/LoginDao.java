package dao;

import model.Usuario;

public interface LoginDao {

    Usuario buscarUsuario(String nome, String senha);

}
