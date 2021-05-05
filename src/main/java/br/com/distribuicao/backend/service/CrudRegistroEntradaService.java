package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.RegistroEntradaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudRegistroEntradaService {
    private final RegistroEntradaRepository registroEntradaRepository;

    public CrudRegistroEntradaService(RegistroEntradaRepository registroEntradaRepository) {
        this.registroEntradaRepository = registroEntradaRepository;
    }
}
