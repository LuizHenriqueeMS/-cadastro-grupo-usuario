package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
//	SELECT exists (SELECT 1 FROM table WHERE column = <value> LIMIT 1);
	@Query(value = "select exists(SELECT u FROM sis_usuario as u WHERE u.usuario = ?1 AND 	u.senha = ?2 LIMIT 1)", nativeQuery = true)
	public String loginbyUsuarioSenha(String usuario, String senha);
	
}
