package com.wmoreira.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wmoreira.cursomc.domain.Contato;

@RepositoryRestResource(collectionResourceRel = "contato", path = "contato")
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

	
}
		