package com.aula.com.Aula;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;

	public Pessoa(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.trim().isEmpty())
			throw new IllegalArgumentException("Nome não pode ser vaziu");
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso <= 0)
			throw new IllegalArgumentException("Peso invalido");
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0)
			throw new IllegalArgumentException("Altura invalida");
		this.altura = altura;
	}

	public double calcularImc() {
		return peso / (altura * altura);
	}

}
