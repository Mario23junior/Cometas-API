package com.project.cometa.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{id}")
	public Optional<Descobertas> list(@PathVariable Long id){
		return serviceDescoberta.listComet(id);
	}
 }
