package com.wmoreira.cursomc.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	String login;
	String nome;
	String email;
	String urlFoto;
	String token;
	List<String> roles;
	

}
