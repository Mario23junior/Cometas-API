package com.project.cometa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cometa.Controller.ServiceController.ServiceDescoberta;
import com.project.cometa.Model.Descobertas;

@RestController
@RequestMapping("/v1/api/cometa")
public class ControllerDescoberta {
  
	private ServiceDescoberta serviceDescoberta;
	
	public ControllerDescoberta(ServiceDescoberta serviceDescoberta) {
		this.serviceDescoberta = serviceDescoberta;
	}
	
	@PostMapping
	public Descobertas save(@RequestBody Descobertas descobertas) {
		return serviceDescoberta.salvarDescoberta(descobertas);
	}
 }
