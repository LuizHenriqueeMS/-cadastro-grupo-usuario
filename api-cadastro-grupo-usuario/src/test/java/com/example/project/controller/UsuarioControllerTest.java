package com.example.project.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.project.model.Usuario;


@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class UsuarioControllerTest {
	
	@Test
	public void incluirUsuario() {
		Usuario usuario = new Usuario("usuarioteste", "nome", "123");
				
		assertEquals("usuarioteste", usuario.getUsuario());
		assertEquals("nome", usuario.getNome());
		assertEquals("", usuario.getSenha());
	}

}
