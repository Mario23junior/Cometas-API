package com.project.cometa.Model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MapaOrbital {
   
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long id;
	
	private Double periodoOrbital;
	private Double Inclinacao;
	private Date ultimaPassagem;
	private Date proximaPassagem;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPeriodoOrbital() {
		return periodoOrbital;
	}
	public void setPeriodoOrbital(Double periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}
	public Double getInclinacao() {
		return Inclinacao;
	}
	public void setInclinacao(Double inclinacao) {
		Inclinacao = inclinacao;
	}
	public Date getUltimaPassagem() {
		return ultimaPassagem;
	}
	public void setUltimaPassagem(Date ultimaPassagem) {
		this.ultimaPassagem = ultimaPassagem;
	}
	public Date getProximaPassagem() {
		return proximaPassagem;
	}
	public void setProximaPassagem(Date proximaPassagem) {
		this.proximaPassagem = proximaPassagem;
	}
}
