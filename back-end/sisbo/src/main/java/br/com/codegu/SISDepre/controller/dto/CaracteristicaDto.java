package br.com.codegu.SISDepre.controller.dto;

import br.com.codegu.SISDepre.model.Caracteristica;

public class CaracteristicaDto {

	private String pertences;
	private String amputacoes;
	private String implante;
	private String sinais;
	private String outros;
	
	public CaracteristicaDto(Caracteristica carac) {
		this.pertences = carac.getPertences();
		this.amputacoes = carac.getAmputacoes();
		this.implante = carac.getImplante();
		this.sinais = carac.getSinais();
		this.outros = carac.getOutros();
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
