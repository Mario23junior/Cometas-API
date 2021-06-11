package com.project.cometa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cometa.Controller.ServiceController.ServiceUsuario;
import com.project.cometa.Model.Usuario;

@RestController
@RequestMapping("/api/v1/user")
public class ControllerUsuario {
    
	private ServiceUsuario serviceUsuario;
	
	public ControllerUsuario(ServiceUsuario serviceUsuario) {
		this.serviceUsuario = serviceUsuario;
	}
	
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		return serviceUsuario.salvarUser(usuario);
	}
}
