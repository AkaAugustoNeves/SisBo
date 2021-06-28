package br.com.codegu.SISDepre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.codegu.SISDepre.controller.form.EnderecoForm;

@Entity
public class Endereco {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String outros;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	@ManyToOne
	private Bairro bairro;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	public Endereco(EnderecoForm form,  Bairro bairro) {
		this.outros = form.getOutros();
		this.cep = form.getCep();
		this.logradouro = form.getLogradouro();
		this.numero = form.getNumero();
		this.complemento = form.getComplemento();
		this.bairro = bairro;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
}
