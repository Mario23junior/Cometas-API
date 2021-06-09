package com.project.cometa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cometa.Controller.ServiceController.ServiceInformacaosOrbitais;
import com.project.cometa.Model.InformacaosOrbitais;

@RestController
@RequestMapping("/v1/api/informcaosOrbitais")
public class ControllerInformacaoOrbitais {
    
	private ServiceInformacaosOrbitais serviceInformaoInformacaosOrbitais;
	
	public ControllerInformacaoOrbitais(ServiceInformacaosOrbitais serviceInformaoInformacaosOrbitais) {
		this.serviceInformaoInformacaosOrbitais = serviceInformaoInformacaosOrbitais;
	}
	
	@PostMapping
	public InformacaosOrbitais save(@RequestBody InformacaosOrbitais informacaosOrbitais) {
		return serviceInformaoInformacaosOrbitais.salvarInformacoes(informacaosOrbitais);
	}
}
