package br.com.distribuicao.backend.orm;

import br.com.distribuicao.backend.dto.RegistroEntradaDTO;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "registro_entradas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codRegistroEntrada;
    private String data;

    @OneToMany(mappedBy = "codRegistro")
    private List<NotaFiscal> notaFiscais;

    public static RegistroEntrada valueOf(RegistroEntradaDTO registroEntradaDTO) {
        return RegistroEntrada.builder()
                .data(registroEntradaDTO.getData())
                .build();
    }

}
