package com.project.cometa.Config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
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
	public void configure(WebSecurity web) throws Exception {
		web
		  .ignoring()
		  .antMatchers("/h2-console/**");
 	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		    .userDetailsService(usuarioServiceImplement)
		    .passwordEncoder(configurationPasswordEncoder.passwordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
		   .csrf().disable()
		   .authorizeRequests()
		       .antMatchers("/v1/api/informcaosOrbitais/**")
	               .hasAnyRole("USER","ADMIN")
		        .antMatchers("/v1/api/mapaOrbital/**")
	               .hasAnyRole("USER","ADMIN")
		         .antMatchers("/v1/api/propriendadesFisicas/**")
	               .hasAnyRole("USER","ADMIN")
		         .antMatchers("/v1/api/listAll/**")
	               .hasAnyRole("USER","ADMIN")
		         .antMatchers(HttpMethod.POST,"/api/v1/user/**")
		           .permitAll()
		           .anyRequest().authenticated()
		         .and()
		           .httpBasic();
  	}
	
}