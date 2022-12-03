package com.example.project.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "sis_grupo")
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int grupoid;
	
	@Column(length = 100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date datacriacao = new Date(System.currentTimeMillis());
	
	@Temporal(TemporalType.DATE)
	private Date dataalteracao = new Date(System.currentTimeMillis());
	
	@OneToOne
	private GrupoUsuario rGrupo;
	
	public int getGrupoid() {
		return grupoid;
	}
	public void setGrupoid(int grupoid) {
		this.grupoid = grupoid;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(Date datacriacao) {
		datacriacao = new Date(System.currentTimeMillis());
		this.datacriacao = datacriacao;
	}
	public Date getDataalteracao() {
		return dataalteracao;
	}
	public void setDataalteracao(Date dataalteracao) {
		dataalteracao = new Date(System.currentTimeMillis());
		this.dataalteracao = dataalteracao;
	}
	public GrupoUsuario getrGrupo() {
		return rGrupo;
	}
	public void setrGrupo(GrupoUsuario rGrupo) {
		this.rGrupo = rGrupo;
	}
}
