package br.com.codegu.SISDepre.service;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codegu.SISDepre.controller.form.DocumentoForm;
import br.com.codegu.SISDepre.controller.form.FalecidoForm;
import br.com.codegu.SISDepre.model.Documento;
import br.com.codegu.SISDepre.model.Falecido;
import br.com.codegu.SISDepre.repository.DocumentoRepository;
import br.com.codegu.SISDepre.repository.FalecidoRepository;

@Service
public class FalecidoService {
	
	@Autowired
	private FalecidoRepository falecidoRepository;

	public Falecido criar(FalecidoForm form) {
		Falecido falecido = new Falecido(form);
		List<Documento> documentos = new ArrayList<>();
		for (DocumentoForm documentoForm: form.getDocumentos() ) {
			Documento documento = new Documento(documentoForm, falecido);
			documentos.add(documento);
		}
		falecido.setDocumentos(documentos);
		return falecidoRepository.save(falecido);
	}
	
	public Falecido editar(FalecidoForm form, Long idFalecido) {
		Optional<Falecido> falecido = falecidoRepository.findById(idFalecido);
		if (falecido.isPresent()) {
			falecido.get().setAltura(form.getAltura());
			falecido.get().setDataNascimento(form.getDataNascimento());
			falecido.get().setNome(form.getNome());
			falecido.get().setNomeMae(form.getNomeMae());
			falecido.get().setPeso(form.getPeso());
			falecido.get().setSexo(form.getSexo());	
			return falecidoRepository.save(falecido.get());
		}
		return null;
	}
	
}
