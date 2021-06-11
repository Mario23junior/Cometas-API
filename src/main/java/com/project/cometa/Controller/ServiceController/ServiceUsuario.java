package com.project.cometa.Controller.ServiceController;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.cometa.Model.Usuario;
import com.project.cometa.Repositorys.RepositoryUsuario;

@Service
public class ServiceUsuario {
    
	private RepositoryUsuario repositoryUsuario;
	private PasswordEncoder passwordEncoder;
	
	public ServiceUsuario(RepositoryUsuario repositoryUsuario, PasswordEncoder passwordEncoder) {
		this.repositoryUsuario =  repositoryUsuario;
		this.passwordEncoder = passwordEncoder;
 	}
	
 	public Usuario salvarUser(Usuario usuario) {
 		String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
 		usuario.setSenha(senhaCriptografada);
		return repositoryUsuario.save(usuario);
	}
	
}
