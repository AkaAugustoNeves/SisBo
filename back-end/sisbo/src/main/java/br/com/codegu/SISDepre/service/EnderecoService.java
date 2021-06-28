package br.com.codegu.SISDepre.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codegu.SISDepre.controller.form.EnderecoForm;
import br.com.codegu.SISDepre.model.Bairro;
import br.com.codegu.SISDepre.model.Cidade;
import br.com.codegu.SISDepre.model.Endereco;
import br.com.codegu.SISDepre.repository.BairroRepository;
import br.com.codegu.SISDepre.repository.CidadeRepository;
import br.com.codegu.SISDepre.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private BairroRepository bairroRepository;
	
	public List<Cidade> listarCidadePorEstado(Long estadoId){
		return cidadeRepository.findByEstadoId(estadoId);
	}
	
	public List<Bairro> listBairroPorCidade(Long cidadeId){
		return bairroRepository.findByCidadeId(cidadeId);
	}
	
	public Endereco criar(EnderecoForm form) {
		return enderecoRepository.save(new Endereco(
					form, bairroRepository.findById(form.getIdBairro()).get()
				)
			);
	}
	
	public Endereco editar (EnderecoForm form, Long idEndereco) {
		Optional<Endereco> endereco = enderecoRepository.findById(idEndereco);
		if (endereco.isPresent()) {
			endereco.get().setBairro(bairroRepository.findById(form.getIdBairro()).get());
			endereco.get().setOutros(form.getOutros());
			endereco.get().setCep(form.getCep());
			endereco.get().setLogradouro(form.getLogradouro());
			endereco.get().setNumero(form.getNumero());
			endereco.get().setComplemento(form.getComplemento());
			return enderecoRepository.save(endereco.get());
		}
		return null;
	}
	
}
