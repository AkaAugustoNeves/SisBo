package br.com.codegu.SISDepre.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.codegu.SISDepre.model.Documento;

public class DocumentoDto {

	private String nome;
	private String numero;
	
	public DocumentoDto(Documento documento) {
		this.nome = documento.getNome();
		this.numero = documento.getNumero();
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
	
	public static List<DocumentoDto> converter(List<Documento> documentos){
		return documentos.stream().map(DocumentoDto::new).collect(Collectors.toList());
	}
}
