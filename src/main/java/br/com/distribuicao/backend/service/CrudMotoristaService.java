package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.MotoristaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudMotoristaService {
    private final MotoristaRepository motoristaRepository;

    public CrudMotoristaService(MotoristaRepository motoristaRepository) {
        this.motoristaRepository = motoristaRepository;
    }
}
