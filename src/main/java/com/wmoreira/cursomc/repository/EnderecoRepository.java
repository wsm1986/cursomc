package com.wmoreira.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wmoreira.cursomc.domain.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer> {

}
