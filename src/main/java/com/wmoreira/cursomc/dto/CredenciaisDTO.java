package com.wmoreira.cursomc.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter		
public class CredenciaisDTO implements Serializable{


	private String email;
	private String senha;
}
