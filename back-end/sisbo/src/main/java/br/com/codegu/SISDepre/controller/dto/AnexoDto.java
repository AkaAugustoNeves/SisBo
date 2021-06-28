package br.com.codegu.SISDepre.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.codegu.SISDepre.model.Anexo;

public class AnexoDto {

	private long id;
	private String nome; 
	private LocalDate data;
	private String usuarioNome;
	
	public AnexoDto(Anexo anexo) {
		this.id = anexo.getId();
		this.nome = anexo.getNome();
		this.data = anexo.getData();
		this.usuarioNome = anexo.getUsuario().getNome();
	}
	public static List<AnexoDto> converter (List<Anexo> anexos){
		return anexos.stream().map(AnexoDto::new).collect(Collectors.toList());
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getUsuarioNome() {
		return usuarioNome;
	}
	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}
}
