package br.com.codegu.SISDepre.controller.form;

import br.com.codegu.SISDepre.model.Caracteristica;

public class CaracteristicaForm {

	private String pertences;
	private String amputacoes;
	private String implantes;
	private String sinais;
	private String outros;
	
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
	public String getImplantes() {
		return implantes;
	}
	public void setImplantes(String implantes) {
		this.implantes = implantes;
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
