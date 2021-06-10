package com.project.cometa.Controller.ServiceController;

import org.springframework.stereotype.Service;

import com.project.cometa.Model.PropriedadesFisicas;
import com.project.cometa.Repositorys.RepositoryPropriedadesFisicas;

@Service
public class ServicePropriedadesFisicas {
  
	private RepositoryPropriedadesFisicas repositoryPropriedadesFisicas;
	
	public ServicePropriedadesFisicas(RepositoryPropriedadesFisicas repositoryPropriedadesFisicas) {
		this.repositoryPropriedadesFisicas = repositoryPropriedadesFisicas;
	}
	
	public PropriedadesFisicas salvarPropriedadeFisica(PropriedadesFisicas propriedadesFisicas) {
		return repositoryPropriedadesFisicas.save(propriedadesFisicas);
	}
}
