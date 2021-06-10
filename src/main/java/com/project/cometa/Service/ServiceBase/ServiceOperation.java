package com.project.cometa.Service.ServiceBase;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.project.cometa.DTOModel.DescobertasDTO;
import com.project.cometa.Model.Descobertas;
import com.project.cometa.Repositorys.RepositoryDescobertas;
import com.project.cometa.Service.ServiceImple;

@Service
public class ServiceOperation implements ServiceImple{
   
	private RepositoryDescobertas repositoryDescobertas;
	private ModelMapper modelMapper;
	
	public ServiceOperation(RepositoryDescobertas repositoryDescobertas, ModelMapper modelMapper) {
		this.repositoryDescobertas = repositoryDescobertas;
		this.modelMapper = modelMapper;
 	}
	
	public List<DescobertasDTO> listAllDatasComet() {
		return ((List<Descobertas>) repositoryDescobertas
				                 .findAll())
				                 .stream()
				                 .map(this::ConverterBaseDescobertaEmDescobertaDTO)
				                 .collect(Collectors.toList());
	}
	
	private DescobertasDTO ConverterBaseDescobertaEmDescobertaDTO(Descobertas descobertas) {
	  modelMapper.getConfiguration()
	             .setMatchingStrategy(MatchingStrategies.LOOSE);
	  
	  DescobertasDTO descobertasDTO = modelMapper
			      .map(descobertas, DescobertasDTO.class);
	  
	  return descobertasDTO;
	}
	
	public List<DescobertasDTO> listAllData() {
		List<DescobertasDTO> listDTO = listAllDatasComet();
		return listDTO
				     .stream()
				     .collect(Collectors.toList());
	}
	
	
}


