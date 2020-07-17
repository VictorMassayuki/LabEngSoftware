
package model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
   
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   
    @Column(name="nome")
    private String nome;
    
    @Column(name = "senha")
	private String senha;

	public Usuario(){}
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }  

}