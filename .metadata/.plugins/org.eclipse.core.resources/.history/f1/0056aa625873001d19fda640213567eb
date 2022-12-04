package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.project.model.Usuario;
import com.example.project.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
		
	@PostMapping("/usuario")
	public ResponseEntity<Usuario> incluirUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.ok((usuarioRepository.save(usuario)));
	}
	
	@GetMapping("/usuario")
	public List<Usuario> consultarUsuariosId() {
			return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Optional<Usuario> consultarUsuariosId(@PathVariable int id) {
		
		return usuarioRepository.findById(id);
	}

	
}
