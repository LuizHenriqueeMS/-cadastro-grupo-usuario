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

import com.example.project.model.Grupo;
import com.example.project.repository.GrupoRepository;

@RestController
@RequestMapping("/api/grupo")
public class GrupoController {

	@Autowired
	private GrupoRepository grupoRepository;
	
	
	@PostMapping
	public ResponseEntity<Grupo> incluirGrupo(@RequestBody Grupo grupo) {
		return ResponseEntity.ok(grupoRepository.save(grupo));
	}
	
	@GetMapping
	public List<Grupo> consultarGrupos() {
		return grupoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Grupo> consultarGrupoId(@PathVariable int id) {
		return grupoRepository.findById(id);
	}
	
}
