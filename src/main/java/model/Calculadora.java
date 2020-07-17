package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calculadora")
public class Calculadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Double numeroUm;
    @Column
    private Double numeroDois;
    @Column
    private String operacao;
    @Column
    private Double resultado;
    @Column
    private LocalDateTime horario;

    @ManyToOne
    private Usuario usuario;

    public Calculadora() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(Double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public Double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(Double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

}
