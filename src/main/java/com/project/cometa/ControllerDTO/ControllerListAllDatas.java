package com.project.cometa.ControllerDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.cometa.DTOModel.DescobertasDTO;
import com.project.cometa.Service.ServiceImple;

@RestController
@RequestMapping("/v1/api/listAll")
public class ControllerListAllDatas {
   
	private ServiceImple serviceImple;
	
	public ControllerListAllDatas(ServiceImple serviceImple) {
		this.serviceImple = serviceImple;
	}
	
	@GetMapping
	public List<DescobertasDTO> listAll() {
		return serviceImple.listAllData();
	}
}
