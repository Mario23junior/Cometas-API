package com.project.cometa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cometa.Controller.ServiceController.ServiceMapaOrbital;
import com.project.cometa.Model.MapaOrbital;

@RestController
@RequestMapping("/v1/api/mapaOrbital")
public class ControllerMapaOrbital {
    
	private ServiceMapaOrbital serviceMapaOrbital;
	
	public ControllerMapaOrbital(ServiceMapaOrbital serviceMapaOrbital) {
		this.serviceMapaOrbital = serviceMapaOrbital;
	}
	
	@PostMapping
	public MapaOrbital save(@RequestBody MapaOrbital mapaOrbital) {
		return serviceMapaOrbital.salvarMapaOrbi(mapaOrbital);
	}
}