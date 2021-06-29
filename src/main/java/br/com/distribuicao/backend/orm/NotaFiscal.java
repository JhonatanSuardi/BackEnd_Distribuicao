package br.com.distribuicao.backend.orm;

import br.com.distribuicao.backend.dto.NotaEstadoDTO;
import br.com.distribuicao.backend.dto.NotaFiscalDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "nota_fiscal")
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotaFiscal {

    @Id
    @Column(name = "cod_nfe")
    private String numNfe;
    private String numSerie;
    private Integer docTransporte;
    private String placa;
    private String perfilCarga;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "planta_id")
    private CodPlanta codPlanta;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "slip_id")
    private Slip codSlip;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "registro_id")
    private RegistroEntrada codRegistro;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "transportadora_id")
    private Transportadora transportadora;

    public static NotaFiscal valueOf(NotaFiscalDTO notaFiscalDTO) {
        Motorista motorista = Motorista.valueOf(notaFiscalDTO.getMotoristaDTO());
        CodPlanta codPlanta = CodPlanta.valueOf(notaFiscalDTO.getCodPlantaDTO());
        Slip codSlip = Slip.valueOf(notaFiscalDTO.getCodSlipDTO());
        RegistroEntrada codRegistro = RegistroEntrada.valueOf(notaFiscalDTO.getCodRegistroDTO());
        Transportadora transportadora = Transportadora.valueOf(notaFiscalDTO.getTransportadoraDTO());
        return NotaFiscal.builder()
                .motorista(motorista)
                .codPlanta(codPlanta)
                .codSlip(codSlip)
                .codRegistro(codRegistro)
                .transportadora(transportadora)
                .numNfe(notaFiscalDTO.getNumNfe())
                .numSerie(notaFiscalDTO.getNumSerie())
                .docTransporte(notaFiscalDTO.getDocTransporte())
                .placa(notaFiscalDTO.getPlaca())
                .perfilCarga(notaFiscalDTO.getPerfilCarga())
                .estado(notaFiscalDTO.getEstado())
                .build();
    }

}
