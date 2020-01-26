package com.wmoreira.cursomc.service;

import java.util.List;

import com.wmoreira.cursomc.domain.Categoria;

public interface CategoriaService {
	List<Categoria> categorias();

	void save(Categoria categoria);
}
