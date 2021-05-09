package br.com.distribuicao.backend.orm;

import br.com.distribuicao.backend.dto.DestinoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "destino")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPlanta;
    private String descricao;
    private String cidade;
    private String estado;

    public static Destino valueOf(DestinoDTO destinoDTO) {
        return Destino.builder()
                .descricao(destinoDTO.getDescricao())
                .cidade(destinoDTO.getCidade())
                .estado(destinoDTO.getEstado())
                .build();
    }
}
