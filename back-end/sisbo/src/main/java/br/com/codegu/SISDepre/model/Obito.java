package br.com.codegu.SISDepre.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.codegu.SISDepre.controller.form.ObitoForm;

@Entity
public class Obito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private LocalDate data = LocalDate.now();
	private LocalDate dataEntrada;
	@ManyToOne
	private TipoObito tipoObito;
	@ManyToOne
	private Falecido falecido;
	@ManyToOne
	private Endereco endereco;
	@ManyToOne
	private Estabelecimento estabelecimento;
	@ManyToOne
	private BoletimOcorrencia boletimOcorrencia;
	@ManyToOne
	private Caracteristica caracteristica;
	@OneToMany(mappedBy = "obito")
	private List<Anexo> anexos = new ArrayList<>();
	
	public Obito() {
		// TODO Auto-generated constructor stub
	}
	
	public Obito(ObitoForm form, TipoObito tipoObito, Falecido falecido, Endereco endereco, Estabelecimento estabelecimento, BoletimOcorrencia boletimOcorrencia, Caracteristica caracteristica) {
		this.dataEntrada = form.getDataEntrada();
		this.tipoObito = tipoObito;
		this.falecido = falecido;
		this.endereco = endereco;
		this.estabelecimento = estabelecimento;
		this.boletimOcorrencia = boletimOcorrencia;
		this.caracteristica = caracteristica;
		System.out.println("criado novo obito");
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
	public Falecido getFalecido() {
		return falecido;
	}
	public void setFalecido(Falecido falecido) {
		this.falecido = falecido;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public BoletimOcorrencia getBoletimOcorrencia() {
		return boletimOcorrencia;
	}
	public void setBoletimOcorrencia(BoletimOcorrencia boletimOcorrencia) {
		this.boletimOcorrencia = boletimOcorrencia;
	}
	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	public List<Anexo> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}
	
}
