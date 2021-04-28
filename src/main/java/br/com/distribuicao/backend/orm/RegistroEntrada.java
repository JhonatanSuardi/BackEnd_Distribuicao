package br.com.distribuicao.backend.orm;

import javax.persistence.*;

@Entity
@Table(name = "registro_entrada")
public class RegistroEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codRegistroEntrada;
    private String data;

    public Integer getCodRegistroEntrada() {
        return codRegistroEntrada;
    }

    public void setCodRegistroEntrada(Integer codRegistroEntrada) {
        this.codRegistroEntrada = codRegistroEntrada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
