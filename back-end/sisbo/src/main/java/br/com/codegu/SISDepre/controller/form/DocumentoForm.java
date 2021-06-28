package br.com.codegu.SISDepre.controller.form;

public class DocumentoForm {

	private String nome;
	private String numero;
	private Long idFalecido;
	
	public DocumentoForm() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Long getIdFalecido() {
		return idFalecido;
	}
	public void setIdFalecido(Long idFalecido) {
		this.idFalecido = idFalecido;
	}
	
}
