package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.orm.NotaFiscal;
import br.com.distribuicao.backend.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nfe")
public class CrudNotaFiscalService {
    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @PostMapping // Request com POST cai aqui.
    @ResponseStatus(HttpStatus.CREATED)
    public NotaFiscal adicionar(@RequestBody NotaFiscal notaFiscal){
        return notaFiscalRepository.save(notaFiscal);
    }
}
