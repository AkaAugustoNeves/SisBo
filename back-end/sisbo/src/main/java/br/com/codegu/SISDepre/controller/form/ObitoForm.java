package br.com.codegu.SISDepre.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ObitoForm {

	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataEntrada;
	private Long tipoObitoId;
	private Long estabelecimentoId;
	private EnderecoForm endereco;
	private BoletimOcorrenciaForm boletimOcorrencia;
	private CaracteristicaForm caracteristica;
	private FalecidoForm falecido;
	
	public ObitoForm() {
		// TODO Auto-generated constructor stub
	}
	public Long getTipoObitoId() {
		return tipoObitoId;
	}
	public void setTipoObitoId(Long tipoObitoId) {
		this.tipoObitoId = tipoObitoId;
	}
	public Long getEstabelecimentoId() {
		return estabelecimentoId;
	}
	public void setEstabelecimentoId(Long estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public EnderecoForm getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoForm endereco) {
		this.endereco = endereco;
	}
	public BoletimOcorrenciaForm getBoletimOcorrencia() {
		return boletimOcorrencia;
	}
	public void setBoletimOcorrencia(BoletimOcorrenciaForm boletimOcorrencia) {
		this.boletimOcorrencia = boletimOcorrencia;
	}
	public CaracteristicaForm getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(CaracteristicaForm caracteristica) {
		this.caracteristica = caracteristica;
	}
	public FalecidoForm getFalecido() {
		return falecido;
	}
	public void setFalecido(FalecidoForm falecido) {
		this.falecido = falecido;
	}
}
