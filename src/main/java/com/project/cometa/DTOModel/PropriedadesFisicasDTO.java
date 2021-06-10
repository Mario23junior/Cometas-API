package com.project.cometa.DTOModel;

public class PropriedadesFisicasDTO {

	private Long id;
	private String dimensoes;
	private String massa;
	private String velocidadeDeEscape;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDimensoes() {
		return dimensoes;
	}

	public void setDimensoes(String dimensoes) {
		this.dimensoes = dimensoes;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getVelocidadeDeEscape() {
		return velocidadeDeEscape;
	}

	public void setVelocidadeDeEscape(String velocidadeDeEscape) {
		this.velocidadeDeEscape = velocidadeDeEscape;
	}
}
