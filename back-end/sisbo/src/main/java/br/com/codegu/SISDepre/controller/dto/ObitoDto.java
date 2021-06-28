package br.com.codegu.SISDepre.controller.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.codegu.SISDepre.model.BoletimOcorrencia;
import br.com.codegu.SISDepre.model.Estabelecimento;
import br.com.codegu.SISDepre.model.Obito;
import br.com.codegu.SISDepre.model.TipoObito;

public class ObitoDto {
	
	private Long id;
	private LocalDate data;
	private LocalDate dataEntrada;
	private TipoObito tipoObito;
	private FalecidoDto falecido;
	private EnderecoDto endereco;
	private CaracteristicaDto caracteristicas;
	private Estabelecimento estabelecimento;
	private BoletimOcorrencia boletinOcorrencia;
	private List<AnexoDto> anexos= new ArrayList<>(); 
	
	public ObitoDto(Obito obito) {
		this.id = obito.getId();
		this.data = obito.getData();
		this.dataEntrada = obito.getDataEntrada();
		this.caracteristicas = new CaracteristicaDto(obito.getCaracteristica());
		this.tipoObito = obito.getTipoObito();
		this.falecido = new FalecidoDto(obito.getFalecido());
		this.endereco = new EnderecoDto(obito.getEndereco());
		this.estabelecimento = obito.getEstabelecimento();
		this.boletinOcorrencia = obito.getBoletimOcorrencia();
		this.anexos = AnexoDto.converter(obito.getAnexos());
		System.out.println("criado novo obitodto");
	}
	
	public static List<ObitoDto> converter(List<Obito> obitos){
		return obitos.stream().map(ObitoDto::new).collect(Collectors.toList());
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public TipoObito getTipoObito() {
		return tipoObito;
	}
	public void setTipoObito(TipoObito tipoObito) {
		this.tipoObito = tipoObito;
	}
	public FalecidoDto getFalecido() {
		return falecido;
	}
	public void setFalecido(FalecidoDto falecido) {
		this.falecido = falecido;
	}
	public EnderecoDto getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public BoletimOcorrencia getBoletinOcorrencia() {
		return boletinOcorrencia;
	}
	public void setBoletinOcorrencia(BoletimOcorrencia boletinOcorrencia) {
		this.boletinOcorrencia = boletinOcorrencia;
	}
	public List<AnexoDto> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<AnexoDto> anexos) {
		this.anexos = anexos;
	}
	public CaracteristicaDto getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(CaracteristicaDto caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}
