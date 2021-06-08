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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Inclinacao == null) ? 0 : Inclinacao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((periodoOrbital == null) ? 0 : periodoOrbital.hashCode());
		result = prime * result + ((proximaPassagem == null) ? 0 : proximaPassagem.hashCode());
		result = prime * result + ((ultimaPassagem == null) ? 0 : ultimaPassagem.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapaOrbital other = (MapaOrbital) obj;
		if (Inclinacao == null) {
			if (other.Inclinacao != null)
				return false;
		} else if (!Inclinacao.equals(other.Inclinacao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (periodoOrbital == null) {
			if (other.periodoOrbital != null)
				return false;
		} else if (!periodoOrbital.equals(other.periodoOrbital))
			return false;
		if (proximaPassagem == null) {
			if (other.proximaPassagem != null)
				return false;
		} else if (!proximaPassagem.equals(other.proximaPassagem))
			return false;
		if (ultimaPassagem == null) {
			if (other.ultimaPassagem != null)
				return false;
		} else if (!ultimaPassagem.equals(other.ultimaPassagem))
			return false;
		return true;
	}
}
