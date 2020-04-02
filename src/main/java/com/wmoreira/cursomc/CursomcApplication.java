package com.wmoreira.cursomc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.wmoreira.cursomc.domain.Cliente;
import com.wmoreira.cursomc.domain.enums.TipoCliente;
import com.wmoreira.cursomc.repository.CategoriaRepository;
import com.wmoreira.cursomc.repository.CidadeRepository;
import com.wmoreira.cursomc.repository.ClienteRepository;
import com.wmoreira.cursomc.repository.EstadoRepository;
import com.wmoreira.cursomc.repository.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder pe;
	;
	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
		Cliente cli1 = new Cliente(null, "Well", "wsm@gmail.com", "33355018880", TipoCliente.PESSOAFISICA, pe.encode("123"));
		
		clienteRepository.save(cli1);

	}	
}