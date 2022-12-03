package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Usuario;
import com.example.project.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping
	public ResponseEntity<Usuario> incluirUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.ok(usuarioRepository.save(usuario));
	}
	
	@GetMapping	
	public List<Usuario> consultarUsuarios() {
		return usuarioRepository.findAll();	
	}
	
	@GetMapping("/{id}")
	public Optional<Usuario> consultarUsuariosId(@PathVariable Long id) {
		return usuarioRepository.findById(id);	
	}
	
	
}
