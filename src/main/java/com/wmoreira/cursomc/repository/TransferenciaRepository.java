package com.wmoreira.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.wmoreira.cursomc.domain.Contato;
import com.wmoreira.cursomc.domain.Transferencia;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, String> {

}
		