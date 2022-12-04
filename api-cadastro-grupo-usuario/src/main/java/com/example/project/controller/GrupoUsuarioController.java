package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Usuario;
import com.example.project.repository.GrupoRepository;
import com.example.project.repository.GrupoUsuarioRepository;
import com.example.project.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class GrupoUsuarioController {
	
	@Autowired
	private GrupoUsuarioRepository grupoUsuarioRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	
	@GetMapping("/usuario")
	public List<Usuario> consultarUsuariosId() {
			return usuarioRepository.findAll();
	}
	
//	@PostMapping("/login")
//	public List<GrupoUsuario> consultarGrupoUsuario(){
//		return grupoUsuarioRepository.findAll();
//	}
	
}
