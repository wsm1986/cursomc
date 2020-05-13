package com.wmoreira.cursomc.controller;


import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.wmoreira.cursomc.domain.Transferencia;
import com.wmoreira.cursomc.service.TransferenciaService;

@RestController
@RequestMapping(value="/transferencia")
public class TransferenciaResource {
	
	@Autowired
	private TransferenciaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Transferencia>> find() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody Transferencia obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	

}