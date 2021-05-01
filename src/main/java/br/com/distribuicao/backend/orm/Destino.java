package br.com.distribuicao.backend.orm;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "destino")
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPlanta;
    private String descricao;
    private String cidade;
    private String estado;

    public Integer getCodPlanta() {
        return codPlanta;
    }

    public void setCodPlanta(Integer codPlanta) {
        this.codPlanta = codPlanta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
