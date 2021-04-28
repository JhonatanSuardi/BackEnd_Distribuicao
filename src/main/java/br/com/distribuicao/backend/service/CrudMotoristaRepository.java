package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.MotoristaRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudMotoristaRepository {
    private final MotoristaRepository motoristaRepository;

    public CrudMotoristaRepository (MotoristaRepository motoristaRepository) {
        this.motoristaRepository = motoristaRepository;
    }
}
