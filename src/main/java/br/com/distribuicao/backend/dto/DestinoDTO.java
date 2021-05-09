package br.com.distribuicao.backend.dto;

import br.com.distribuicao.backend.orm.Destino;
import br.com.distribuicao.backend.orm.NotaFiscal;
import lombok.Data;

@Data
public class DestinoDTO {
    private String descricao;
    private String cidade;
    private String estado;


}
