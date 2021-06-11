package com.project.cometa.Repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cometa.Model.Usuario;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long>{
   
	Optional<Usuario> findByLogin(String username);
}
