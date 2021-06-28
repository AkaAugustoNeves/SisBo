package br.com.codegu.SISDepre.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codegu.SISDepre.controller.form.BoletimOcorrenciaForm;
import br.com.codegu.SISDepre.model.BoletimOcorrencia;
import br.com.codegu.SISDepre.model.DistritoPolicial;
import br.com.codegu.SISDepre.repository.BoletimOcorrenciaRepository;
import br.com.codegu.SISDepre.repository.DistritoPolicialRepository;

@Service
public class BoletimOcorrenciaService {

	@Autowired
	private BoletimOcorrenciaRepository boletimOcorrenciaRepository;
	
	@Autowired
	private DistritoPolicialRepository distritoPolicialRepository; 
	
	public List<DistritoPolicial> buscarTodos(){
		return distritoPolicialRepository.findAll();
	}
	
	public DistritoPolicial buscarDistritoPorId(Long id) {
		return distritoPolicialRepository.findById(id).get();
	}
	
	public BoletimOcorrencia criarBO(BoletimOcorrenciaForm form) {
		DistritoPolicial distrito = buscarDistritoPorId(form.getIdDistritoPolicial());
		return boletimOcorrenciaRepository.save(new BoletimOcorrencia(form, distrito));
	}
	
	public BoletimOcorrencia editar(BoletimOcorrenciaForm form, Long idBoletimOcorrencia) {
		Optional<BoletimOcorrencia> boletim = boletimOcorrenciaRepository.findById(idBoletimOcorrencia);
		if (boletim.isPresent()) {
			DistritoPolicial distrito = buscarDistritoPorId(form.getIdDistritoPolicial());
			boletim.get().setDistritoPolicial(distrito);
			boletim.get().setGec(form.getGec());
			boletim.get().setNumero(form.getNumero());
			return boletimOcorrenciaRepository.save(boletim.get());
		}
		return null;
	} 
}
