package br.com.distribuicao.backend.dto;

import br.com.distribuicao.backend.orm.Motorista;
import lombok.Data;

@Data
public class MotoristaDTO {
    private String cpf;
    private String nome;


}
