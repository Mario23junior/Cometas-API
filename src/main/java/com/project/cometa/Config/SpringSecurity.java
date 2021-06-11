package com.project.cometa.Config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.project.cometa.Service.ServiceBase.UsuarioServiceImplement;

@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter{
  
	private UsuarioServiceImplement usuarioServiceImplement;
	
	public SpringSecurity(UsuarioServiceImplement usuarioServiceImplement) {
		this.usuarioServiceImplement = usuarioServiceImplement;
 	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}
	
}
