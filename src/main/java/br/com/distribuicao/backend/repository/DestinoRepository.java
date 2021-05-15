package br.com.distribuicao.backend.repository;

import br.com.distribuicao.backend.orm.CodPlanta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepository extends CrudRepository<CodPlanta, Integer> {
}
