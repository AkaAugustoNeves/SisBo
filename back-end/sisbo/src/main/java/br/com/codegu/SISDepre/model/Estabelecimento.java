package br.com.codegu.SISDepre.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String cnes;
	
	public Estabelecimento(String cnes) {
		this.cnes = cnes;
	}
	public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnes() {
		return cnes;
	}
	public void setCnes(String cnes) {
		this.cnes = cnes;
	}
	
}
