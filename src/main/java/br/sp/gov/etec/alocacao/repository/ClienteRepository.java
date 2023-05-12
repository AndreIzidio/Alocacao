package br.sp.gov.etec.alocacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.etec.alocacao.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByName(String Nome);

}
