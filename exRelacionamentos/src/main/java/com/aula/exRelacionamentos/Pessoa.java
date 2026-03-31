package com.aula.exRelacionamentos;

public class Pessoa {
	
public Pessoa(String nome, int idade) {
		
		super();
		setNome(nome);
		setIdade(idade);
		setCaro(caro);
		
	}
	
	
	public Pessoa(String nome, int idade, Carro caro) {
		setNome(nome);
		setIdade(idade);
		setCaro(caro);
		
	}
	
	private String nome;
	private int idade;
	private Carro caro;
	
	public Carro getCaro() {
		return caro;
	}
	public void setCaro(Carro caro) {
		this.caro = caro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
