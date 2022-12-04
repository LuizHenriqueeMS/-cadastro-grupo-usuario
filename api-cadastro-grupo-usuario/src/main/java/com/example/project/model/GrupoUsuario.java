package com.example.project.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "sis_grupo_usuario")
public class GrupoUsuario {
	
	@OneToMany
	@Transient
	private List<Usuario> usuario;
	
	@OneToMany
	@Transient
	private List<Grupo> grupo;
	
	@Column(nullable = true)
	@JoinColumn(name = "grupoid", referencedColumnName = "grupoid")
	private int grupoid;

	@Id
	@Column(nullable = true)
	@JoinColumn(name = "usuarioid", referencedColumnName = "usuarioid")
	private int usuarioid;

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(List<Grupo> grupo) {
		this.grupo = grupo;
	}

	public int getGrupoid() {
		return grupoid;
	}

	public void setGrupoid(int grupoid) {
		this.grupoid = grupoid;
	}

	public int getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}

	
}
