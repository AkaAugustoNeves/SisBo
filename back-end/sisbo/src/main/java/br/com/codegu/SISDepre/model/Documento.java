package br.com.codegu.SISDepre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.codegu.SISDepre.controller.form.DocumentoForm;

@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private String numero;
	@ManyToOne
	private Falecido falecido;
	
	public Documento() {
		// TODO Auto-generated constructor stub
	}
	public Documento(DocumentoForm form, Falecido falecido) {
		this.nome = form.getNome();
		this.numero = form.getNumero();
		this.falecido = falecido;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Falecido getFalecido() {
		return falecido;
	}
	public void setFalecido(Falecido falecido) {
		this.falecido = falecido;
	}
	
}
