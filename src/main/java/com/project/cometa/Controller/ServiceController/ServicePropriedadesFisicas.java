package com.project.cometa.Controller.ServiceController;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;
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
	
	public Optional<PropriedadesFisicas> listPropriedadesFisicas(Long id) {
		 Optional<PropriedadesFisicas> list = repositoryPropriedadesFisicas.findById(id);
		 list.orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhum dado para ser exibido"));
		 return list;
	}
}
