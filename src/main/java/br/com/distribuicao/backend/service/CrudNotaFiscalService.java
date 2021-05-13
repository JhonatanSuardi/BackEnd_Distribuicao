package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.dto.NotaFiscalDTO;
import br.com.distribuicao.backend.orm.NotaFiscal;
import br.com.distribuicao.backend.repository.NotaFiscalRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping ("/nfe")
public class CrudNotaFiscalService {

        @Autowired
        private NotaFiscalRepository notaFiscalRepository;

        @GetMapping(path = "/{codNfe}") // Mapeando verbo http(get) para quando receber a request cair nesse método e ele responde.
        @ResponseStatus(HttpStatus.OK)
        public ResponseEntity<NotaFiscal> Listar(@PathVariable String codNfe){
            return notaFiscalRepository.findById(codNfe)
                    .map(record -> ResponseEntity.ok().body(record))
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping // Request com POST cai aqui.
        @ResponseStatus(HttpStatus.CREATED)
        public void adicionar(@RequestBody NotaFiscalDTO notaFiscalDTO){
            System.out.println(notaFiscalDTO);
            notaFiscalRepository.save(NotaFiscal.valueOf(notaFiscalDTO));
        }

        @PutMapping(value="/{cod_nfe}")
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity update(@PathVariable String cod_nfe,
                                     @RequestBody NotaFiscalDTO notaFiscalDTO) {
            NotaFiscal notaFiscal = NotaFiscal.valueOf(notaFiscalDTO);
            return notaFiscalRepository.findById(cod_nfe)
                    .map(record -> {
                        record.setMotorista(notaFiscal.getMotorista());
                        record.setCodPlanta(notaFiscal.getCodPlanta());
                        record.setCodRegistro(notaFiscal.getCodRegistro());
                        record.setTransportadora(notaFiscal.getTransportadora());
                        record.setNumNfe(notaFiscal.getNumNfe());
                        record.setNumSerie(notaFiscal.getNumSerie());
                        record.setDocTransporte(notaFiscal.getDocTransporte());
                        record.setPlaca(notaFiscal.getPlaca());
                        record.setPerfilCarga(notaFiscal.getPerfilCarga());
                        record.setEstado(notaFiscal.getEstado());
                        NotaFiscal updated = notaFiscalRepository.save(record);
                        return ResponseEntity.ok().body(updated);
                    }).orElse(ResponseEntity.notFound().build());

        }

        @DeleteMapping(path ={"/{cod_nfe}"})
        @ResponseStatus(HttpStatus.OK)
        public ResponseEntity <?> delete(@PathVariable String cod_nfe) {
            return notaFiscalRepository.findById(cod_nfe.toString())
                    .map(record -> {
                        notaFiscalRepository.deleteById(cod_nfe);
                        return ResponseEntity.ok().build();
                    }).orElse(ResponseEntity.notFound().build());
        }

}
