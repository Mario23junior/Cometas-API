package com.project.cometa.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Descobertas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String imagen;
	private String nome;
	private String designacao;
	private String coDeNome;

	@OneToMany(mappedBy = "descobertas", cascade = CascadeType.ALL)
	private List<InformacaosOrbitais> informacaosOrbitais;

	@OneToMany(mappedBy = "descobertas", cascade = CascadeType.ALL)
	private List<MapaOrbital> mapaOrbitals;

	@OneToMany(mappedBy = "descobertas", cascade = CascadeType.ALL)
	private List<PropriedadesFisicas> propriedadesFisicas;
    
	
	public Long getId() {
		return id;
	}
    
	@JsonIgnore
	public List<InformacaosOrbitais> getInformacaosOrbitais() {
		return informacaosOrbitais;
	}

	public void setInformacaosOrbitais(List<InformacaosOrbitais> informacaosOrbitais) {
		this.informacaosOrbitais = informacaosOrbitais;
	}

	@JsonIgnore
	public List<MapaOrbital> getMapaOrbitals() {
		return mapaOrbitals;
	}

	public void setMapaOrbitals(List<MapaOrbital> mapaOrbitals) {
		this.mapaOrbitals = mapaOrbitals;
	}
    
	@JsonIgnore
	public List<PropriedadesFisicas> getPropriedadesFisicas() {
		return propriedadesFisicas;
	}

	public void setPropriedadesFisicas(List<PropriedadesFisicas> propriedadesFisicas) {
		this.propriedadesFisicas = propriedadesFisicas;
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
}
