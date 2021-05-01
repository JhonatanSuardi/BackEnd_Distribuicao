package br.com.distribuicao.backend.repository;

import br.com.distribuicao.backend.orm.NotaFiscal;
import org.springframework.data.repository.CrudRepository;

public interface NotaFiscalRepository extends CrudRepository<Integer, NotaFiscal> {
}
