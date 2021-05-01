package br.com.distribuicao.backend.orm;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "registro_entradas")
public class RegistroEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codRegistroEntrada;
    private String data;
    @OneToMany(mappedBy = "codRegistro")
    private List<NotaFiscal> notaFiscais;

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
