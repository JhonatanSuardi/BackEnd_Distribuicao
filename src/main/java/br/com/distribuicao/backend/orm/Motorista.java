package br.com.distribuicao.backend.orm;

import br.com.distribuicao.backend.dto.MotoristaDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "motorista")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codMotorista;
    private String cpf;
    private String nome;

    @OneToMany(mappedBy = "motorista")
    private List<NotaFiscal> notaFiscais;

    public Motorista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public static Motorista valueOf(MotoristaDTO motoristaDTO) {
        return Motorista.builder()
                .cpf(motoristaDTO.getCpf())
                .nome(motoristaDTO.getNome())
                .build();
    }
}
