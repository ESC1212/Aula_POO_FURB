package com.aula.AnimalExemplo;

public class Vaca extends Animal implements Herbivoro{
 
	public Vaca(int idade, String nome) {
		super(idade, nome);
	}
	
	@Override
	public void som() {
		System.out.println("Muuuuuuuu");
	}
	
	@Override
	public void comerMatin() {
		System.out.println("MUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU, MUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU, MUUUUUUUUUUuUuuUuuuuUUUUUUUUUUUUuUuuUUUUUUUuuuuuuuuuuuuuuuuuuUUUUUuuuUUUUUuuUUUuuUUU");
	}
	
	
	
}