package br.com.codegu.SISDepre.controller.dto;

import br.com.codegu.SISDepre.model.Endereco;

public class EnderecoDto {

	private String outros;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairroNome;
	private String cidadeNome;
	private String estadoUf;
	
	public EnderecoDto( Endereco endereco) {
		this.outros = endereco.getOutros();
		this.cep= endereco.getCep();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairroNome = endereco.getBairro().getNome();
		this.cidadeNome = endereco.getBairro().getCidade().getNome();
		this.estadoUf = endereco.getBairro().getCidade().getEstado().getUf();
	}
	public String getOutros() {
		return outros;
	}
	public void setOutros(String outros) {
		this.outros = outros;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairroNome() {
		return bairroNome;
	}
	public void setBairroNome(String bairroNome) {
		this.bairroNome = bairroNome;
	}
	public String getCidadeNome() {
		return cidadeNome;
	}
	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}
	public String getEstadoUf() {
		return estadoUf;
	}
	public void setEstadoUf(String estadoUf) {
		this.estadoUf = estadoUf;
	}
	
}
