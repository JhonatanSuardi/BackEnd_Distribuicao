package br.com.distribuicao.backend;

import br.com.distribuicao.backend.service.CrudTransportadoraService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DistribuicaoApplication implements CommandLineRunner {
    CrudTransportadoraService crudTransportadoraService;

    public static void main(String[] args) {
        SpringApplication.run(DistribuicaoApplication.class, args);
    }

    public DistribuicaoApplication(CrudTransportadoraService crudTransportadoraService) {
        this.crudTransportadoraService = crudTransportadoraService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("rodou");
        crudTransportadoraService.inicial();
    }
}
