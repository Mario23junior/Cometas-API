package com.project.cometa.Controller.ServiceController;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;
import com.project.cometa.Model.MapaOrbital;
import com.project.cometa.Repositorys.RepositoryMapaOrbital;

@Service
public class ServiceMapaOrbital {
   
	private RepositoryMapaOrbital repositoryMapaOrbital;
	
	public ServiceMapaOrbital(RepositoryMapaOrbital repositoryMapaOrbital) {
		this.repositoryMapaOrbital = repositoryMapaOrbital;
	}
	
	public MapaOrbital salvarMapaOrbi(MapaOrbital mapaOrbital) {
		MapaOrbital saveInfo = repositoryMapaOrbital.save(mapaOrbital);
		return saveInfo;
	}
	
	public Optional<MapaOrbital> listMapaOrbit(Long id) {
		Optional<MapaOrbital> list = repositoryMapaOrbital.findById(id);
		list.orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhuma informação para ser exibida que conresponda a esse valor"));
		return list;
	}
	
	public void deletarMapaOrbit(Long id) {
		repositoryMapaOrbital
		                    .findById(id)
		                    .map(deleteMapa -> {
		                        repositoryMapaOrbital.deleteById(id); 
		                        return deleteMapa;
		                    }).orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nehuma informação foi encontrada para deletar"));
	}
}
