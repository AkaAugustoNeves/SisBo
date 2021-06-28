package br.com.codegu.SISDepre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.codegu.SISDepre.controller.form.BoletimOcorrenciaForm;

@Entity
public class BoletimOcorrencia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String numero;
	private String gec;
	@ManyToOne
	private DistritoPolicial distritoPolicial;
	public BoletimOcorrencia() {
		
	}	
	public BoletimOcorrencia(BoletimOcorrenciaForm form, DistritoPolicial distritoPolicial) {
		this.numero = form.getNumero();
		this.gec = form.getGec();
		this.distritoPolicial = distritoPolicial;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public DistritoPolicial getDistritoPolicial() {
		return distritoPolicial;
	}
	public void setDistritoPolicial(DistritoPolicial distritoPolicial) {
		this.distritoPolicial = distritoPolicial;
	}
	
}
