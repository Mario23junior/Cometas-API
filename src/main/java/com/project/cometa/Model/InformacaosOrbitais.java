package com.project.cometa.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InformacaosOrbitais {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double excentricidade;
	private Double semiEixoMaior;
	private Double pontoDeHorbitaProximoDoSol;
	private Double pontoDeHorbitaAfastadoDoSol;
	private boolean emObservacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getExcentricidade() {
		return excentricidade;
	}
	public void setExcentricidade(Double excentricidade) {
		this.excentricidade = excentricidade;
	}
	public Double getSemiEixoMaior() {
		return semiEixoMaior;
	}
	public void setSemiEixoMaior(Double semiEixoMaior) {
		this.semiEixoMaior = semiEixoMaior;
	}
	public Double getPontoDeHorbitaProximoDoSol() {
		return pontoDeHorbitaProximoDoSol;
	}
	public void setPontoDeHorbitaProximoDoSol(Double pontoDeHorbitaProximoDoSol) {
		this.pontoDeHorbitaProximoDoSol = pontoDeHorbitaProximoDoSol;
	}
	public Double getPontoDeHorbitaAfastadoDoSol() {
		return pontoDeHorbitaAfastadoDoSol;
	}
	public void setPontoDeHorbitaAfastadoDoSol(Double pontoDeHorbitaAfastadoDoSol) {
		this.pontoDeHorbitaAfastadoDoSol = pontoDeHorbitaAfastadoDoSol;
	}
	public boolean isEmObservacao() {
		return emObservacao;
	}
	public void setEmObservacao(boolean emObservacao) {
		this.emObservacao = emObservacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (emObservacao ? 1231 : 1237);
		result = prime * result + ((excentricidade == null) ? 0 : excentricidade.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pontoDeHorbitaAfastadoDoSol == null) ? 0 : pontoDeHorbitaAfastadoDoSol.hashCode());
		result = prime * result + ((pontoDeHorbitaProximoDoSol == null) ? 0 : pontoDeHorbitaProximoDoSol.hashCode());
		result = prime * result + ((semiEixoMaior == null) ? 0 : semiEixoMaior.hashCode());
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
		InformacaosOrbitais other = (InformacaosOrbitais) obj;
		if (emObservacao != other.emObservacao)
			return false;
		if (excentricidade == null) {
			if (other.excentricidade != null)
				return false;
		} else if (!excentricidade.equals(other.excentricidade))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pontoDeHorbitaAfastadoDoSol == null) {
			if (other.pontoDeHorbitaAfastadoDoSol != null)
				return false;
		} else if (!pontoDeHorbitaAfastadoDoSol.equals(other.pontoDeHorbitaAfastadoDoSol))
			return false;
		if (pontoDeHorbitaProximoDoSol == null) {
			if (other.pontoDeHorbitaProximoDoSol != null)
				return false;
		} else if (!pontoDeHorbitaProximoDoSol.equals(other.pontoDeHorbitaProximoDoSol))
			return false;
		if (semiEixoMaior == null) {
			if (other.semiEixoMaior != null)
				return false;
		} else if (!semiEixoMaior.equals(other.semiEixoMaior))
			return false;
		return true;
	}
	
	
	
}
