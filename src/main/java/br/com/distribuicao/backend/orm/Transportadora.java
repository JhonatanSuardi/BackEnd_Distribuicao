package br.com.distribuicao.backend.orm;


import br.com.distribuicao.backend.dto.TransportadoraDTO;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "transportadora")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codTransportadora;
    private String nome;

    @OneToMany(mappedBy = "transportadora")
    private List<NotaFiscal> notaFiscalList;

    public static Transportadora valueOf(TransportadoraDTO transportadoraDTO) {
        return Transportadora.builder()
                .nome(transportadoraDTO.getNome())
                .build();
    }
}
