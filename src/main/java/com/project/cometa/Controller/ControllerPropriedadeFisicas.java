package com.project.cometa.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cometa.Controller.ServiceController.ServicePropriedadesFisicas;
import com.project.cometa.Model.PropriedadesFisicas;

@RestController
@RequestMapping("/v1/api/propriendadesFisicas")
public class ControllerPropriedadeFisicas {
   
	private ServicePropriedadesFisicas servicePropriedadesFisicas;
	
	public ControllerPropriedadeFisicas(ServicePropriedadesFisicas servicePropriedadesFisicas) {
	   this.servicePropriedadesFisicas = servicePropriedadesFisicas;
	}
	
	@PostMapping
	public PropriedadesFisicas save(@RequestBody PropriedadesFisicas propriedadesFisicas) {
		return servicePropriedadesFisicas.salvarPropriedadeFisica(propriedadesFisicas);
	}
}
