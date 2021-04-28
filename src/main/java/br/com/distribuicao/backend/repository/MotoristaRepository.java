package br.com.distribuicao.backend.repository;

import br.com.distribuicao.backend.orm.Motorista;
import br.com.distribuicao.backend.orm.Transportadora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoristaRepository extends CrudRepository<Motorista, Integer> {
}
