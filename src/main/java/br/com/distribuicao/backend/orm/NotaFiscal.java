package br.com.distribuicao.backend.orm;

import javax.persistence.*;

@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {

    @ManyToOne(optional = false)
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;
    @OneToOne
    @JoinColumn(name = "planta_id")
    private Destino codPlanta;
    @OneToOne
    @JoinColumn(name = "slip_id")
    private Slip codSlip;
    @ManyToOne
    @JoinColumn(name = "registro_id")
    private RegistroEntrada codRegistro;
    @ManyToOne
    @JoinColumn(name = "transportadora_id")
    private Transportadora transportadora;
    @Id
    @Column(name = "cod_nfe")
    private Integer numNfe;
    private Integer numSerie;
    private int docTransporte;
    private String placa;
    private String perfilCarga;
    private Enum<Estado> estado;
}
