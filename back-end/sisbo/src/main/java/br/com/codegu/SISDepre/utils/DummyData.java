package br.com.codegu.SISDepre.utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.codegu.SISDepre.model.Bairro;
import br.com.codegu.SISDepre.model.Cidade;
import br.com.codegu.SISDepre.model.DistritoPolicial;
import br.com.codegu.SISDepre.model.Estabelecimento;
import br.com.codegu.SISDepre.model.Estado;
import br.com.codegu.SISDepre.model.Falecido;
import br.com.codegu.SISDepre.model.Obito;
import br.com.codegu.SISDepre.model.TipoObito;
import br.com.codegu.SISDepre.repository.BairroRepository;
import br.com.codegu.SISDepre.repository.CidadeRepository;
import br.com.codegu.SISDepre.repository.DistritoPolicialRepository;
import br.com.codegu.SISDepre.repository.EstabelecimentoRepository;
import br.com.codegu.SISDepre.repository.EstadoRepository;
import br.com.codegu.SISDepre.repository.FalecidoRepository;
import br.com.codegu.SISDepre.repository.TipoObitoRepository;

//@Component
public class DummyData {

	@Autowired
	private TipoObitoRepository tipoObitoRepository;
	
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	
	@Autowired
	private DistritoPolicialRepository distritoPolicialRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private BairroRepository bairroRepository;
	
	//@PostConstruct
	public void save() {
		 List<TipoObito> tiposObito = new ArrayList<>();
		 TipoObito tipoObito1 = new TipoObito("FETAL"); 
		 TipoObito tipoObito2 = new TipoObito("NÃO-FETAL");
		 tiposObito.add(tipoObito1);
		 tiposObito.add(tipoObito2);
		 tipoObitoRepository.saveAll(tiposObito);
		 
		 List<Estabelecimento> estabelecimentos = new ArrayList<>();
		 Estabelecimento estabelecimento1 = new Estabelecimento("CNES0001");
		 Estabelecimento estabelecimento2 = new Estabelecimento("CNES0002");
		 estabelecimentos.add(estabelecimento1);
		 estabelecimentos.add(estabelecimento2);
		 estabelecimentoRepository.saveAll(estabelecimentos);
		 
		List<DistritoPolicial> distritosPoliciais = new ArrayList<>(); 
		DistritoPolicial distritoPolicial1 = new DistritoPolicial("6 CIA de COMANDOS");
		DistritoPolicial distritoPolicial2 = new DistritoPolicial("6 CIA de CÃES DE GUERRA");
		distritosPoliciais.add(distritoPolicial1);
		distritosPoliciais.add(distritoPolicial2);
		distritoPolicialRepository.saveAll(distritosPoliciais);
		
		Estado estado1 = new Estado("BAHIA", "BA");
		Estado estado2 = new Estado("SÃO PAULO", "SP");
		Estado bahia = estadoRepository.save(estado1);
		Estado saoPaulo = estadoRepository.save(estado2);
		
		Cidade salvador = new Cidade("SALVADOR", bahia);
		Cidade lauroDeFreitas = new Cidade("LAURO DE FREITAS", bahia);
		Cidade cSaoPaulo = new Cidade("SÃO PAULO", saoPaulo);
		Cidade cidade1 = cidadeRepository.save(salvador);
		Cidade cidade2 = cidadeRepository.save(lauroDeFreitas);
		Cidade cidade3 = cidadeRepository.save(cSaoPaulo);
		
		Bairro sussuarana = new Bairro("SUSSUARANA", cidade1);
		Bairro engomadeira = new Bairro("ENGOMADEIRA", cidade1);
		Bairro portao = new Bairro("PORTÃO", cidade2);
		bairroRepository.save(sussuarana);
		bairroRepository.save(engomadeira);
		bairroRepository.save(portao);
		
	}
	
}
