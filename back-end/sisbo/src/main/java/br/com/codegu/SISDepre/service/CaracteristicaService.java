package br.com.codegu.SISDepre.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codegu.SISDepre.controller.form.CaracteristicaForm;
import br.com.codegu.SISDepre.model.Caracteristica;
import br.com.codegu.SISDepre.repository.CaracteristicaRepository;

@Service
public class CaracteristicaService {

	@Autowired
	private CaracteristicaRepository caracteristicaRepository;
	
	public Caracteristica criar(CaracteristicaForm form) {
		return caracteristicaRepository.save(new Caracteristica(form));
	}
	
	public Caracteristica editar(CaracteristicaForm form, Long idCarac) {
		Optional<Caracteristica> carac = caracteristicaRepository.findById(idCarac);
		if (carac.isPresent()) {
			carac.get().setAmputacoes(form.getAmputacoes());
			carac.get().setImplante(form.getImplantes());
			carac.get().setOutros(form.getOutros());
			carac.get().setPertences(form.getPertences());
			carac.get().setSinais(form.getSinais());
			return caracteristicaRepository.save(carac.get());
		}
		return null;
	}
}
