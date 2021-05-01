package br.com.distribuicao.backend.orm;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "motorista")
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codMotorista;
    private String cpf;
    private String nome;
    @OneToMany(mappedBy = "motorista")
    private List<NotaFiscal> notaFiscais;

    public Integer getCodMotorista() {
        return codMotorista;
    }

    public void setCodMotorista(Integer codMotorista) {
        this.codMotorista = codMotorista;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
