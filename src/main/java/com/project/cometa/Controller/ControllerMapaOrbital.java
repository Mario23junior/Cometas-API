package com.project.cometa.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public Optional<MapaOrbital> list(@PathVariable Long id) {
		return serviceMapaOrbital.listMapaOrbit(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		  serviceMapaOrbital.deletarMapaOrbit(id);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id, @RequestBody MapaOrbital mapaOrbital) {
		 serviceMapaOrbital.updateMaperOrbit(id, mapaOrbital);
	}
	
	
}
