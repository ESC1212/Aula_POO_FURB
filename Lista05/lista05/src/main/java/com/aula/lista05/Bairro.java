package com.aula.lista05;

public class Bairro {
	private String nome;
	private double coeficienteIptu;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (!(nome == null || nome.isBlank()))
			this.nome = nome;
		else
			throw new IllegalArgumentException("Nome não pode estar vaziu!");
	}
	public double getCoeficienteIptu() {
		return coeficienteIptu;
	}
	public void setCoeficienteIptu(double coeficienteIptu) {
		if (coeficienteIptu > 0)
			this.coeficienteIptu = coeficienteIptu;
		else
			throw new IllegalArgumentException("Coeficiente inválido");
	}
}
