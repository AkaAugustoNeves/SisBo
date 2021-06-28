package br.com.codegu.SISDepre.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FalecidoForm {

	private BigDecimal altura;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataNascimento;
	private String nome;
	private String nomeMae;
	private BigDecimal peso;
	private String sexo;
	private List<DocumentoForm> documentos = new ArrayList<>(); 
	
	public List<DocumentoForm> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoForm> documentos) {
		this.documentos = documentos;
	}
	public BigDecimal getAltura() {
		return altura;
	}
	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
