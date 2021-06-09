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
	
	@GetMapping("/{id}")
	public Optional<InformacaosOrbitais> list(@PathVariable Long id){
		return serviceInformaoInformacaosOrbitais.listByInformatOrbit(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		serviceInformaoInformacaosOrbitais.deleteInformatOrbi(id);
	}
	
	@PutMapping("/{id}")
	public void update(@RequestBody InformacaosOrbitais informacaosOrbitais, @PathVariable Long id) {
		 serviceInformaoInformacaosOrbitais.updateInformatOrbi(informacaosOrbitais, id);
	}
}
