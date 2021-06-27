package br.com.distribuicao.backend.dto;


import br.com.distribuicao.backend.orm.Estado;
import lombok.Data;

@Data
public class NotaEstadoDTO {
    private Estado estado;
}
