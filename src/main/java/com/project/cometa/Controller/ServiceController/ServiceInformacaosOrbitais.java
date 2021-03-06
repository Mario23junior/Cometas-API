package com.project.cometa.Controller.ServiceController;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;
import com.project.cometa.Model.InformacaosOrbitais;
import com.project.cometa.Repositorys.RepositoryInformacaosOrbitas;

@Service
public class ServiceInformacaosOrbitais {
    
	private RepositoryInformacaosOrbitas repositoryInformacaosOrbitas;
	
	public ServiceInformacaosOrbitais(RepositoryInformacaosOrbitas repositoryInformacaosOrbitas) {
		this.repositoryInformacaosOrbitas = repositoryInformacaosOrbitas;
	}
	
	public InformacaosOrbitais salvarInformacoes(InformacaosOrbitais informacaosOrbitais) {
		InformacaosOrbitais saveInfoOrb = repositoryInformacaosOrbitas.save(informacaosOrbitais);
		return saveInfoOrb;
	}
	
	public Optional<InformacaosOrbitais> listByInformatOrbit(Long id) {
		Optional<InformacaosOrbitais> list = repositoryInformacaosOrbitas.findById(id);
		list.orElseThrow(() -> new ResourceNotFoundExceptionIntercept("informação não encontrada"));
		return list;
	}
	
	public void deleteInformatOrbi(Long id) {
		repositoryInformacaosOrbitas 
		                          .findById(id)
		                          .map(deleteId -> {
		                        	  repositoryInformacaosOrbitas.deleteById(id);
		                        	  return deleteId;
		                          }).orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhuma informação encontrada na base de dados"));
		                          
	}
	
	public void updateInformatOrbi(InformacaosOrbitais informacaosOrbitais, Long id) {
		repositoryInformacaosOrbitas 
		                           .findById(id)
		                           .map(updateInfor -> {
		                              informacaosOrbitais.setId(updateInfor.getId());
		                              repositoryInformacaosOrbitas.save(informacaosOrbitais);
		                              return updateInfor;
		                           }).orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhuma informação encontrada para atualizar informações"));
	}
	
}