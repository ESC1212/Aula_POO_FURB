package com.aula.AnimalExemplo;


public abstract class Animal {
	protected int idade;
	protected String nome;
	
	public Animal(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
	
	public abstract void som();
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
 