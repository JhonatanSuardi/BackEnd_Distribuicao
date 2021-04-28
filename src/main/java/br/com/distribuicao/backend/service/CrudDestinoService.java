package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.DestinoRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudDestinoService {
    private final DestinoRepository destinoRepository;

    public CrudDestinoService(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository;
    }


}
