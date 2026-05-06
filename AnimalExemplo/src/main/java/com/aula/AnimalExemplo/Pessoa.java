package com.aula.AnimalExemplo;

public class Pessoa extends Animal implements Onivoro{
	public Pessoa(int idade, String nome) {
		super(idade, nome);
	}
	@Override
	public void comerCarne() {
		System.out.println("eu como carni");
	}
	@Override
	public void comerMatin() {
		System.out.println("eu como mato");
	}
	@Override
	public void som() {
		System.out.println("Eu sou uma pessoa, eu pago imposto");
	}
}
