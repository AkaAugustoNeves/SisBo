package br.com.codegu.SISDepre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codegu.SISDepre.model.Auxiliar;
import br.com.codegu.SISDepre.model.DistritoPolicial;
import br.com.codegu.SISDepre.model.Estabelecimento;
import br.com.codegu.SISDepre.model.Estado;
import br.com.codegu.SISDepre.model.TipoObito;
import br.com.codegu.SISDepre.repository.DistritoPolicialRepository;
import br.com.codegu.SISDepre.repository.EstabelecimentoRepository;
import br.com.codegu.SISDepre.repository.EstadoRepository;
import br.com.codegu.SISDepre.repository.TipoObitoRepository;

@Service
public class AuxiliarService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private TipoObitoRepository tipoObitoRepository;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private DistritoPolicialRepository distritoPolicialRepository;
	
	public Auxiliar povoarTela(){
		List<Estado> estados = estadoRepository.findAll();
		List<TipoObito> tipoObitos = tipoObitoRepository.findAll();
		List<DistritoPolicial> distritosPoliciais = distritoPolicialRepository.findAll();
		List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
		return new Auxiliar(tipoObitos, estabelecimentos, distritosPoliciais, estados);
	}
	
	
	
}
