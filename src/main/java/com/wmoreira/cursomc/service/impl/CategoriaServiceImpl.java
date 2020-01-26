package com.wmoreira.cursomc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmoreira.cursomc.domain.Categoria;
import com.wmoreira.cursomc.repository.CategoriaRepository;
import com.wmoreira.cursomc.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> categorias() {
		return categoriaRepository.findAll();
	}

	@Override
	public void save(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

}
