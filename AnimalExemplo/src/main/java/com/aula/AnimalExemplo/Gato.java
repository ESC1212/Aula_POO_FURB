package com.aula.AnimalExemplo;

public class Gato extends Animal implements Carnivoro{
	
	public Gato(int idade, String nome) {
		super(idade, nome);
	}
	
	@Override
	public void som() {
		System.out.println("Miiaaaauuu");
	}
	
	@Override
	public void comerCarne() {
		System.out.println("Gato pirata come carne miARRRRRR");
	}
}