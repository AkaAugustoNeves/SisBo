package br.com.codegu.SISDepre.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.codegu.SISDepre.model.Obito;

public class ObitoListDto {

	private Long id;
	private String ufEstado;
	private List<DocumentoDto> documentos;
	private String falecidoNome;
	private String tipoObito;
	
	public ObitoListDto(Obito obito) {
		this.id = obito.getId();
		this.ufEstado = obito.getEndereco().getBairro().getCidade().getEstado().getUf();
		this.documentos = DocumentoDto.converter(obito.getFalecido().getDocumentos());
		this.falecidoNome = obito.getFalecido().getNome();
		this.tipoObito = obito.getTipoObito().getNome();
	}
	
	public static List<ObitoListDto> converter(List<Obito> obitos){
		return obitos.stream().map(ObitoListDto::new).collect(Collectors.toList());
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUfEstado() {
		return ufEstado;
	}
	public void setUfEstado(String ufEstado) {
		this.ufEstado = ufEstado;
	}
	public List<DocumentoDto> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoDto> documentos) {
		this.documentos = documentos;
	}

	public String getFalecidoNome() {
		return falecidoNome;
	}
	public void setFalecidoNome(String falecidoNome) {
		this.falecidoNome = falecidoNome;
	}
	public String getTipoObito() {
		return tipoObito;
	}
	public void setTipoObito(String tipoObito) {
		this.tipoObito = tipoObito;
	}
}
