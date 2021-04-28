package br.com.distribuicao.backend.service;

import br.com.distribuicao.backend.repository.TransportadoraRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudTransportadoraService {
    private final TransportadoraRepository transportadoraRepository;

    public CrudTransportadoraService(TransportadoraRepository transportadoraRepository) {
        this.transportadoraRepository = transportadoraRepository;
    }

    public void inicial() {
        System.out.println("está em transp");
    }
}
