package br.com.codegu.SISDepre.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.codegu.SISDepre.controller.dto.ObitoDto;
import br.com.codegu.SISDepre.controller.dto.ObitoListDto;
import br.com.codegu.SISDepre.controller.form.BoletimOcorrenciaForm;
import br.com.codegu.SISDepre.controller.form.CaracteristicaForm;
import br.com.codegu.SISDepre.controller.form.ObitoForm;
import br.com.codegu.SISDepre.model.BoletimOcorrencia;
import br.com.codegu.SISDepre.model.Caracteristica;
import br.com.codegu.SISDepre.model.Endereco;
import br.com.codegu.SISDepre.model.Estabelecimento;
import br.com.codegu.SISDepre.model.Falecido;
import br.com.codegu.SISDepre.model.Obito;
import br.com.codegu.SISDepre.model.TipoObito;
import br.com.codegu.SISDepre.repository.CaracteristicaRepository;
import br.com.codegu.SISDepre.repository.EstabelecimentoRepository;
import br.com.codegu.SISDepre.repository.ObitoRepository;
import br.com.codegu.SISDepre.repository.TipoObitoRepository;

@Service
public class ObitoService {

	@Autowired
	private ObitoRepository obitoRepository;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private TipoObitoRepository tipoObitoRepository;
	
	@Autowired
	private BoletimOcorrenciaService boletionOcorrenciaService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private FalecidoService falecidoService;
	
	@Autowired
	private CaracteristicaService caracteristicaService;
	
	public List<ObitoListDto> list(){
		return  ObitoListDto.converter(obitoRepository.findAll());
	}
	
	public ResponseEntity<ObitoDto> buscarPorId(Long id){
		Optional<Obito> obito = obitoRepository.findById(id);
		if (obito.isPresent()) {
			return ResponseEntity.ok(new ObitoDto(obito.get()));
		}
		return ResponseEntity.notFound().build();
		
	}
	
	public ResponseEntity<ObitoDto> criar(@RequestBody ObitoForm form, UriComponentsBuilder uriBuilder){
		return ResponseEntity.ok(
			new ObitoDto(
				obitoRepository.save(
					new Obito(
							form,
							buscarTipoObito(form.getTipoObitoId()),
							falecidoService.criar(form.getFalecido()),
							enderecoService.criar(form.getEndereco()),
							buscarEstabelecimento(form.getEstabelecimentoId()),
							boletionOcorrenciaService.criarBO(form.getBoletimOcorrencia()),
							caracteristicaService.criar(form.getCaracteristica())
					)
				)
			)
		);
	}
	
	public ResponseEntity<ObitoDto> editar(ObitoForm form, Long idObito,UriComponentsBuilder uriBuilder){
		Optional<Obito> obito = obitoRepository.findById(idObito);
		if (obito.isPresent()) {
			obito.get().setTipoObito(buscarTipoObito(form.getTipoObitoId()));
			obito.get().setEstabelecimento(buscarEstabelecimento(form.getEstabelecimentoId()));
			obito.get().setEndereco(enderecoService.editar(form.getEndereco(), obito.get().getEndereco().getId()));
			obito.get().setBoletimOcorrencia(boletionOcorrenciaService.editar(form.getBoletimOcorrencia(), obito.get().getBoletimOcorrencia().getId()));
			obito.get().setCaracteristica(caracteristicaService.editar(form.getCaracteristica(), obito.get().getCaracteristica().getId()));
			obito.get().setFalecido(falecidoService.editar(form.getFalecido(), obito.get().getFalecido().getId()));
			return ResponseEntity.ok(new ObitoDto( obitoRepository.save(obito.get())));
		}
		return ResponseEntity.notFound().build();
	}
	
	public ResponseEntity<?> deletar(Long id){
		if (obitoRepository.findById(id).isPresent()) {
			obitoRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();		
	}
	
	public Estabelecimento buscarEstabelecimento(Long id) {
		return estabelecimentoRepository.findById(id).get();
	}
	
	public TipoObito buscarTipoObito(Long id) {
		return tipoObitoRepository.findById(id).get();
	}
	
	public BoletimOcorrencia criarBoletimOcorrencia(BoletimOcorrenciaForm form) {
		return new BoletimOcorrencia( 
				form, boletionOcorrenciaService.buscarDistritoPorId(form.getIdDistritoPolicial())
		);
	}	
}
