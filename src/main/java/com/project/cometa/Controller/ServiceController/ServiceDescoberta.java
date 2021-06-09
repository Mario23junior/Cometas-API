package com.project.cometa.Controller.ServiceController;

import org.springframework.stereotype.Service;

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
}
