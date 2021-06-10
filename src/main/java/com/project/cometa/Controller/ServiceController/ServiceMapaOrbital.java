package com.project.cometa.Controller.ServiceController;

import org.springframework.stereotype.Service;

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
}
