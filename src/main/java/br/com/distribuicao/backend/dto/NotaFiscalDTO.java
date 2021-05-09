package br.com.distribuicao.backend.dto;

import br.com.distribuicao.backend.orm.*;
import lombok.Data;

@Data
public class NotaFiscalDTO {
    private MotoristaDTO motoristaDTO;
    private DestinoDTO codPlantaDTO;
    private SlipDTO codSlipDTO;
    private RegistroEntradaDTO codRegistroDTO;
    private TransportadoraDTO transportadoraDTO;
    private String numNfe;
    private String numSerie;
    private Integer docTransporte;
    private String placa;
    private String perfilCarga;
    private Estado estado;
}