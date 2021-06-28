package br.com.codegu.SISDepre.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.codegu.SISDepre.controller.form.FalecidoForm;

@Entity
public class Falecido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private String nomeMae;
	private BigDecimal altura;
	private BigDecimal peso;
	@OneToMany(mappedBy = "falecido")
	private List<Documento> documentos = new ArrayList<>();
 	
	public Falecido() {
		// TODO Auto-generated constructor stub
	}
	public Falecido(FalecidoForm form) {
		this.nome= form.getNome();
		this.dataNascimento = form.getDataNascimento();
		this.sexo = form.getSexo();
		this.nomeMae = form.getNomeMae();
		this.altura = form.getAltura();
		this.peso = form.getPeso();
	}
	public Falecido(String nome, LocalDate dataNascimento, String sexo, String nomeMae, BigDecimal altura, BigDecimal peso) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.nomeMae = nomeMae;
		this.altura= altura;
		this.peso = peso;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
}
