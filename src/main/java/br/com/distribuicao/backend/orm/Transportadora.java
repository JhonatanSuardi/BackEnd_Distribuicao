package br.com.distribuicao.backend.orm;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "transportadora")
@Data
@ToString
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codTransportadora;
    private String nome;

}
