package com.project.cometa.DTOModel;

import java.util.List;

public class DescobertasDTO {
   
	private Long id;
	private String imagen;
    private String nome;
    private String designacao;
	private String coDeNome;
	
	private List<InformacaosOrbitaisDTO> informacaosOrbitaisDTOs;
	private List<MapaOrbitalDTO> mapaOrbitalDTOs;
	private List<PropriedadesFisicasDTO> propriedadesFisicasDTOs;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesignacao() {
		return designacao;
	}
	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}
	public String getCoDeNome() {
		return coDeNome;
	}
	public void setCoDeNome(String coDeNome) {
		this.coDeNome = coDeNome;
	}
	public List<InformacaosOrbitaisDTO> getInformacaosOrbitaisDTOs() {
		return informacaosOrbitaisDTOs;
	}
	public void setInformacaosOrbitaisDTOs(List<InformacaosOrbitaisDTO> informacaosOrbitaisDTOs) {
		this.informacaosOrbitaisDTOs = informacaosOrbitaisDTOs;
	}
	public List<MapaOrbitalDTO> getMapaOrbitalDTOs() {
		return mapaOrbitalDTOs;
	}
	public void setMapaOrbitalDTOs(List<MapaOrbitalDTO> mapaOrbitalDTOs) {
		this.mapaOrbitalDTOs = mapaOrbitalDTOs;
	}
	public List<PropriedadesFisicasDTO> getPropriedadesFisicasDTOs() {
		return propriedadesFisicasDTOs;
	}
	public void setPropriedadesFisicasDTOs(List<PropriedadesFisicasDTO> propriedadesFisicasDTOs) {
		this.propriedadesFisicasDTOs = propriedadesFisicasDTOs;
	}
	
	
	
}
