package com.wmoreira.cursomc.security;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.wmoreira.cursomc.domain.enums.Perfil;

public class UserSpringSecurity  implements UserDetails {
		private static final long serialVersionUID = 1L;

		private Integer id;
		private String email;
		private String senha;
		private String nome;
		private Collection<? extends GrantedAuthority> authorities;
		private List<String> roles;


	
		public UserSpringSecurity() {
		}

		public UserSpringSecurity(Integer id, String email, String senha, String nome, Set<Perfil> perfis) {
			super();
			this.id = id;
			this.email = email;
			this.senha = senha;
			this.nome = nome;
			this.authorities = perfis.stream().map(x -> new SimpleGrantedAuthority(x.getDescricao())).collect(Collectors.toList());
			this.roles = perfis.stream().map(x -> x.getDescricao()).collect(Collectors.toList());
		
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public boolean hasRole(Perfil perfil) {
			return getAuthorities().contains(new SimpleGrantedAuthority(perfil.getDescricao()));
		}

		public Integer getId() {
			return id;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authorities;
		}

		@Override
		public String getPassword() {
			return senha;
		}

		@Override
		public String getUsername() {
			return email;
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}
		
		public List<String> getRoles() {
			return roles;
		}

		public void setRoles(List<String> roles) {
			this.roles = roles;
		}

	}