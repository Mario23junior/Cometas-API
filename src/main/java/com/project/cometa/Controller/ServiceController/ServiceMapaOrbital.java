package com.project.cometa.Controller.ServiceController;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;
import com.project.cometa.Model.MapaOrbital;
import com.project.cometa.Repositorys.RepositoryMapaOrbital;

@Service
public class ServiceMapaOrbital {
   
	private RepositoryMapaOrbital repoisRepositoryMapaOrbital;
	
	public ServiceMapaOrbital(RepositoryMapaOrbital repoisRepositoryMapaOrbital) {
		this.repoisRepositoryMapaOrbital = repoisRepositoryMapaOrbital;
	}
	
	public MapaOrbital salvarMapaOrbi(MapaOrbital mapaOrbital) {
		MapaOrbital saveInfo = repoisRepositoryMapaOrbital.save(mapaOrbital);
		return saveInfo;
	}
	
	public Optional<MapaOrbital> listMapaOrbit(Long id) {
		Optional<MapaOrbital> list = repoisRepositoryMapaOrbital.findById(id);
		list.orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhuma informação para ser exibida que conresponda a esse valor"));
		return list;
	}
}
