package com.project.cometa.Service.ServiceBase;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.project.cometa.Exception.UserNotFoundExistes;
import com.project.cometa.Model.Usuario;
import com.project.cometa.Repositorys.RepositoryUsuario;

@Service
public class SecurityService {
    
	private RepositoryUsuario repositoryUsuario;
	
	public SecurityService(RepositoryUsuario repositoryUsuario) {
		this.repositoryUsuario = repositoryUsuario;
	}
	
	public UserDetails findUserByUsername(String username) throws UserNotFoundExistes {
	   
		Usuario user = repositoryUsuario
				                       .findByLogin(username)
				                       .orElseThrow(() -> new UserNotFoundExistes("Usuario inesisten , voçê não possui cadastro"));
		
	   String [] roles = user.isAdmin() ? new String[] 	   
			   {"ADMIN","USER"} : new String[] {"USER"};
	   
	   return User
			     .builder()
			     .username(user.getLogin())
			     .password(user.getSenha())
			     .roles(roles)
			     .build();
	}
}
