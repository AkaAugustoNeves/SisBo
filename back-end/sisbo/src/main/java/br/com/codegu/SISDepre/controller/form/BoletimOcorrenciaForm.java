package br.com.codegu.SISDepre.controller.form;

import br.com.codegu.SISDepre.model.DistritoPolicial;

public class BoletimOcorrenciaForm {

	private String numero;
	private String gec;
	private Long idDistritoPolicial;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getGec() {
		return gec;
	}
	public void setGec(String gec) {
		this.gec = gec;
	}
	public Long getIdDistritoPolicial() {
		return idDistritoPolicial;
	}
	public void setIdDistritoPolicial(Long idDistritoPolicial) {
		this.idDistritoPolicial = idDistritoPolicial;
	}
	
	
}
