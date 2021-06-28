package br.com.codegu.SISDepre.model;

import java.util.ArrayList;
import java.util.List;

public class Auxiliar {

	public List<TipoObito> tipoObitos = new ArrayList<>();
	public List<Estabelecimento> estabelecimentos = new ArrayList<>();
	public List<DistritoPolicial> distritosPoliciais = new ArrayList<>();
	public List<Estado> estados = new ArrayList<>();
	
	public Auxiliar(List<TipoObito> tipoObitos,List<Estabelecimento> estabelecimentos,List<DistritoPolicial> distritosPoliciais, List<Estado> estados ) {
		this.tipoObitos = tipoObitos;
		this.distritosPoliciais = distritosPoliciais;
		this.estabelecimentos = estabelecimentos;
		this.estados = estados;
	}
	public List<TipoObito> getTipoObitos() {
		return tipoObitos;
	}
	public void setTipoObitos(List<TipoObito> tipoObitos) {
		this.tipoObitos = tipoObitos;
	}
	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}
	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}
	public List<DistritoPolicial> getDistritosPoliciais() {
		return distritosPoliciais;
	}
	public void setDistritosPoliciais(List<DistritoPolicial> distritosPoliciais) {
		this.distritosPoliciais = distritosPoliciais;
	}
	public List<Estado> getEstados() {
		return estados;
	}
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}
}
