package com.aula.Lista08;

import java.util.ArrayList;

public class Contas {
	
	private ArrayList<Pagavel> contas = new ArrayList<Pagavel>();
	
	public void incluirConta(Pagavel conta) {
		contas.add(conta);		
	}
	public ArrayList<Pagavel> getContas(){
		return contas;
	}
	public double calcularTotalContas() {
		double total = 0;
		for (Pagavel pagavel : contas) {
			total += pagavel.calcularValorPagar();
		}
		return total;
	}
}
