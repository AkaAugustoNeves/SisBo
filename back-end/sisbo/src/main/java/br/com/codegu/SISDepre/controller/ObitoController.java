package br.com.codegu.SISDepre.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.codegu.SISDepre.controller.dto.ObitoDto;
import br.com.codegu.SISDepre.controller.dto.ObitoListDto;
import br.com.codegu.SISDepre.controller.form.ObitoForm;
import br.com.codegu.SISDepre.model.Obito;
import br.com.codegu.SISDepre.service.ObitoService;

@RestController
@RequestMapping("/obito")
public class ObitoController {

	@Autowired
	private ObitoService obitoService;
	
	@GetMapping
	public List<ObitoListDto> list(){
		return obitoService.list();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ObitoDto> buscarPorId(@PathVariable Long id){
		return obitoService.buscarPorId(id);
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<ObitoDto> criar(@RequestBody ObitoForm form, UriComponentsBuilder uriBuilder){
		System.out.println("chegou aqui 2");
		return obitoService.criar(form, uriBuilder);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<ObitoDto> editar(@RequestBody ObitoForm form, @PathVariable Long id, UriComponentsBuilder uriBuilder){
		return obitoService.editar(form, id, uriBuilder);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> delete(@PathVariable Long id){
		return obitoService.deletar(id);
	}
}
