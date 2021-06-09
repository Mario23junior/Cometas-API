package com.project.cometa.Controller.ServiceController;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.cometa.Exception.ResourceNotFoundExceptionIntercept;
import com.project.cometa.Model.Descobertas;
import com.project.cometa.Repositorys.RepositoryDescobertas;

@Service
public class ServiceDescoberta {
    
	private RepositoryDescobertas repositoryDescobertas;
	
	public ServiceDescoberta(RepositoryDescobertas repositoryDescobertas) {
		this.repositoryDescobertas = repositoryDescobertas;
 	}
	
	public Descobertas salvarDescoberta(Descobertas descobertas) {
		Descobertas salvarCometas = repositoryDescobertas.save(descobertas);
		return salvarCometas;
	}
	
	public Optional<Descobertas> listComet(Long id){
		Optional<Descobertas> list = repositoryDescobertas.findById(id);
		list.orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhum cometa encontrado"));
		return list;
	}
	
	public void deleteComet(Long id) {
		repositoryDescobertas
		              .findById(id)
		              .map(delete -> {
		            	  repositoryDescobertas.deleteById(id);
 		            	  return delete;
		              }).orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhum cometa encontrado para ser deletado"));
	}
	
	public void updateComet(Descobertas descobertas, Long id) {
		repositoryDescobertas
		                   .findById(id)
		                   .map(update -> {
		                	   descobertas.setId(update.getId());
		                	   repositoryDescobertas.save(descobertas);
		                	   return update;
		                   }).orElseThrow(() -> new ResourceNotFoundExceptionIntercept("Nenhum cometa encontrada para ser atualizadas"));
	}
}
