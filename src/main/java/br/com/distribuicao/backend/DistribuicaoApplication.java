package br.com.distribuicao.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class DistribuicaoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DistribuicaoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("rodou");
    }
}
