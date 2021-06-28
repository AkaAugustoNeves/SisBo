package br.com.codegu.SISDepre.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.codegu.SISDepre.model.Falecido;

public class FalecidoDto {

	private long id;
	private BigDecimal altura;
	private LocalDate dataNascimento;
	private String nome;
	private String nomeMae;
	private BigDecimal peso;
	private String sexo;
	private List<DocumentoDto> documentos = new ArrayList<>();
	
	public FalecidoDto(Falecido falecido) {
		this.id = falecido.getId();
		this.altura = falecido.getAltura();
		this.dataNascimento = falecido.getDataNascimento();
		this.nome = falecido.getNome();
		this.nomeMae = falecido.getNomeMae();
		this.peso = falecido.getPeso();
		this.sexo = falecido.getSexo();
		this.documentos = DocumentoDto.converter(falecido.getDocumentos());
	}
	public static List<FalecidoDto> converter(List<Falecido> falecidos) {
		return falecidos.stream().map(FalecidoDto::new).collect(Collectors.toList());
	}
		public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public List<DocumentoDto> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoDto> documentos) {
		this.documentos = documentos;
	}

	
}
