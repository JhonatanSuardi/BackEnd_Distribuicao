package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.SlipRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudSlipService {
    private final SlipRepository slipRepository;

    public CrudSlipService(SlipRepository slipRepository) {
        this.slipRepository = slipRepository;
    }


}
