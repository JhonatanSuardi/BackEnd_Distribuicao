package br.com.distribuicao.backend.orm;

import br.com.distribuicao.backend.dto.SlipDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "slip")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Slip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codSlip;
    private String data;

    public static Slip valueOf(SlipDTO slipDTO) {
        return Slip.builder()
                .data(slipDTO.getData())
                .build();
    }
}
