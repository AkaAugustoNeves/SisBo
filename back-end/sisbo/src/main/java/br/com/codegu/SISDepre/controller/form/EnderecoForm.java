package br.com.codegu.SISDepre.controller.form;

public class EnderecoForm {

	private String outros;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private Long idBairro;
	
	public EnderecoForm() {
		// TODO Auto-generated constructor stub
	}
	
	public EnderecoForm(String outros, String cep, String logradouro, String numero, String complemento, Long idBairro) {
		this.outros = outros;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
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

	public Long getIdBairro() {
		return idBairro;
	}

	public void setIdBairro(Long idBairro) {
		this.idBairro = idBairro;
	}
	
	
	
}
