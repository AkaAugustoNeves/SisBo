package br.com.codegu.SISDepre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codegu.SISDepre.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	List<Cidade> findByEstadoId(Long id);
	
}
