package br.com.codegu.SISDepre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codegu.SISDepre.model.Bairro;

public interface BairroRepository extends JpaRepository<Bairro, Long>{

	List<Bairro> findByCidadeId(Long cidadeId);
	
}
