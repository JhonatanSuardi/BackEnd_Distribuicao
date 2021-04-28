package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.RegistroEntradaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudRegistroEntradaRepository {
    private final RegistroEntradaRepository registroEntradaRepository;

    public CrudRegistroEntradaRepository(RegistroEntradaRepository registroEntradaRepository) {
        this.registroEntradaRepository = registroEntradaRepository;
    }
}
