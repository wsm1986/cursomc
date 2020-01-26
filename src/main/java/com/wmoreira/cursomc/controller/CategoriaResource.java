package com.wmoreira.cursomc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wmoreira.cursomc.domain.Categoria;
import com.wmoreira.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public List<Categoria> lista() {
		return service.categorias();
	}

}
