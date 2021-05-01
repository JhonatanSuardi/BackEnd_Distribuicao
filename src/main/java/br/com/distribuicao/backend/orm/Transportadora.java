package br.com.distribuicao.backend.orm;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "transportadora")
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codTransportadora;
    private String nome;
    @OneToMany(mappedBy = "transportadora")
    private List<NotaFiscal> notaFiscalList;

    public Integer getCodTransportadora() {
        return codTransportadora;
    }

    public void setCodTransportadora(Integer codTransportadora) {
        this.codTransportadora = codTransportadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
