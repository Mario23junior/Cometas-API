package com.project.cometa.DTOModel;

public class InformacaosOrbitaisDTO {
   
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
	
	
}
