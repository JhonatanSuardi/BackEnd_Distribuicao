package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.dto.NotaFiscalDTO;
import br.com.distribuicao.backend.orm.NotaFiscal;
import br.com.distribuicao.backend.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudNotaFiscalService {
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @PostMapping("/nfe") // Request com POST cai aqui.
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@RequestBody NotaFiscalDTO notaFiscalDTO){
        System.out.println(notaFiscalDTO);
        notaFiscalRepository.save(NotaFiscal.valueOf(notaFiscalDTO));
    }
}
