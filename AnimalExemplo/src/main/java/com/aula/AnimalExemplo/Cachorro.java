package com.aula.AnimalExemplo;

public class Cachorro extends Animal {
	public Cachorro(int idade, String nome) {
		super(idade, nome);
	}
	
	@Override
	public void som() {
		System.out.println("Au Au");
	}	
 
}