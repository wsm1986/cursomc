package com.wmoreira.cursomc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wmoreira.cursomc.dto.Usuario;
import com.wmoreira.cursomc.security.JWTUtil;
import com.wmoreira.cursomc.security.UserSpringSecurity;
import com.wmoreira.cursomc.service.UserService;

@RestController
@RequestMapping(value = "/auth")
public class AuthResource {

	@Autowired
	private JWTUtil jwtUtil;

	@RequestMapping(value = "/refresh_token", method = RequestMethod.POST)
	public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
		UserSpringSecurity user = UserService.authenticated();
		String token = jwtUtil.generateToken(user.getUsername());
		response.addHeader("Authorization", "Bearer " + token);
		return ResponseEntity.noContent().build();
	}
	
//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//	public ResponseEntity<Usuario> user(HttpServletResponse response) {
//		UserSpringSecurity user = UserService.authenticated();
//		
//		//Usuario usuario = new Usuario(user.getId(), user.getNome(), user.getUsername());
//		
//		return ResponseEntity.ok().body();
//	}
}