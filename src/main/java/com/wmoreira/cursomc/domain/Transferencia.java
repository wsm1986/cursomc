package com.wmoreira.cursomc.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transferencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private BigDecimal valor;

	@OneToOne
	private Contato contato;

}