package com.project.cometa.TestControllerDescobertas;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.project.cometa.Controller.ServiceController.ServiceDescoberta;
import com.project.cometa.Model.Descobertas;
import com.project.cometa.Repositorys.RepositoryDescobertas;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class TesteDescobertaService {
   
 	
	@Autowired
	MockMvc Mvc;
	
	@Mock
	private RepositoryDescobertas repositoryDesco;
	
	@InjectMocks
	private ServiceDescoberta serviceDesc;
 
	
	@Test
	@DisplayName("Salvando informacaoes no banco de dados")
	public void TestSalvandoDescobertas() {
		
		//Montando cenario
		Descobertas desc = new Descobertas();
		desc.setImagen("link-url-imagem");
		desc.setNome("halley");
		desc.setDesignacao("P1");
		desc.setCoDeNome("cometa Halley P1");
		
		// verificando operações
		serviceDesc.salvarDescoberta(desc);
		
		//execução
		verify(repositoryDesco,times(1)).save(desc);
	}
}
