package br.com.codegu.SISDepre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.codegu.SISDepre.model.Auxiliar;
import br.com.codegu.SISDepre.model.Bairro;
import br.com.codegu.SISDepre.model.Cidade;
import br.com.codegu.SISDepre.service.AuxiliarService;
import br.com.codegu.SISDepre.service.EnderecoService;

@RestController
@RequestMapping("/tela")
public class AuxiliarController {

	@Autowired
	private AuxiliarService auxiliarService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public Auxiliar povoarTela() {
		return auxiliarService.povoarTela();
	}
	
	@GetMapping("/cidade/{idEstado}")
	public List<Cidade> listarCidadePorIdEstado(@PathVariable Long idEstado){
		return enderecoService.listarCidadePorEstado(idEstado);
	}
	
	@GetMapping("/bairro/{idCidade}")
	public List<Bairro> listBairroPorCidade(@PathVariable Long idCidade){
		return enderecoService.listBairroPorCidade(idCidade);
	}
	
	
}
