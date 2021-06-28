package br.com.codegu.SISDepre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.codegu.SISDepre.controller.form.CaracteristicaForm;

@Entity
public class Caracteristica {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String pertences;
	private String amputacoes;
	private String implante;
	private String sinais;
	private String outros;
	
	public Caracteristica() {
		// TODO Auto-generated constructor stub
	}
	
	public Caracteristica(CaracteristicaForm form) {
		this.pertences = form.getPertences();
		this.amputacoes = form.getAmputacoes();
		this.implante = form.getImplantes();
		this.sinais = form.getSinais();
		this.outros = form.getOutros();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPertences() {
		return pertences;
	}
	public void setPertences(String pertences) {
		this.pertences = pertences;
	}
	public String getAmputacoes() {
		return amputacoes;
	}
	public void setAmputacoes(String amputacoes) {
		this.amputacoes = amputacoes;
	}
	public String getImplante() {
		return implante;
	}
	public void setImplante(String implante) {
		this.implante = implante;
	}
	public String getSinais() {
		return sinais;
	}
	public void setSinais(String sinais) {
		this.sinais = sinais;
	}
	public String getOutros() {
		return outros;
	}
	public void setOutros(String outros) {
		this.outros = outros;
	}
	
}
