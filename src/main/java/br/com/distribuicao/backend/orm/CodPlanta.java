package br.com.distribuicao.backend.orm;

import br.com.distribuicao.backend.dto.CodPlantaDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cod_planta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CodPlanta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPlanta;
    private String descricaoOrigem;
    private String cidadeOrigem;
    private String estadoOrigem;

    public static CodPlanta valueOf(CodPlantaDTO codPlantaDTO) {
        return CodPlanta.builder()
                .descricaoOrigem(codPlantaDTO.getDescricaoOrigem())
                .cidadeOrigem(codPlantaDTO.getCidadeOrigem())
                .cidadeOrigem(codPlantaDTO.getEstadoOrigem())
                .build();
    }
}
