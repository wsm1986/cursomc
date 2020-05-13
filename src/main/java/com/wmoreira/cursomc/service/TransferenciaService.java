package com.wmoreira.cursomc.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmoreira.cursomc.domain.Contato;
import com.wmoreira.cursomc.domain.Transferencia;
import com.wmoreira.cursomc.repository.ContatoRepository;
import com.wmoreira.cursomc.repository.TransferenciaRepository;

@Service
public class TransferenciaService {

	@Autowired
	private TransferenciaRepository repo;

	@Autowired
	private ContatoRepository contatoRepo;

	public List<Transferencia> findAll() {
		return repo.findAll();
	}

	public @Valid Transferencia insert(@Valid Transferencia obj) {
		Optional<Contato> contato = contatoRepo.findById(obj.getContato().getId());

		if (contato.isPresent()) {
			obj.setContato(contato.get());
		} else {
			contatoRepo.save(obj.getContato());
		}

		repo.save(obj);

		return obj;
	}

}