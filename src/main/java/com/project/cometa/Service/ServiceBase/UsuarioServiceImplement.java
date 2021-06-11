package com.project.cometa.Service.ServiceBase;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;
import com.project.cometa.Model.Usuario;
import com.project.cometa.Repositorys.RepositoryUsuario;

@Service
public class UsuarioServiceImplement implements UserDetailsService{
   
	private RepositoryUsuario repositoryUsuario;
	
	public UsuarioServiceImplement(RepositoryUsuario repositoryUsuario) {
		 this.repositoryUsuario = repositoryUsuario;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 		 Usuario usuario = repositoryUsuario
 		                 .findByLogin(username)
 		                 .orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Usuario não cadastrado no banco de dados"));
 		 
 		 String[] roles = usuario.isAdmin() ?
 				  new String[] {"ADMIN","USER"} : new String[] {"USER"};
 		 
 		 return User
 				   .builder()
 				   .username(usuario.getLogin())
 				   .password(usuario.getSenha())
 				   .roles(roles)
 				   .build();
	}
}
