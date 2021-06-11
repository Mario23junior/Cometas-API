package com.project.cometa.Config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.project.cometa.Service.ServiceBase.UsuarioServiceImplement;
import com.project.cometa.Utils.ConfigurationPasswordEncoder;

@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter{
  
	private UsuarioServiceImplement usuarioServiceImplement;
	private ConfigurationPasswordEncoder configurationPasswordEncoder;
	
	public SpringSecurity(UsuarioServiceImplement usuarioServiceImplement,ConfigurationPasswordEncoder configurationPasswordEncoder) {
		this.usuarioServiceImplement = usuarioServiceImplement;
		this.configurationPasswordEncoder = configurationPasswordEncoder;
 	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		    .userDetailsService(usuarioServiceImplement)
		    .passwordEncoder(configurationPasswordEncoder.passwordEncoder());
	}
	
}
