package br.com.distribuicao.backend.repository;

import br.com.distribuicao.backend.orm.RegistroEntrada;
import br.com.distribuicao.backend.orm.Transportadora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroEntradaRepository extends CrudRepository<RegistroEntrada, Integer> {
}
