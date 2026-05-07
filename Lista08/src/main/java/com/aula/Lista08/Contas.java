package com.aula.Lista08;

import java.util.ArrayList;

public class Contas {
	
	private ArrayList<Pagavel> P = new ArrayList<Pagavel>();
	
	public void incluirConta(Pagavel conta) {
		P.add(conta);		
	}
	public ArrayList<Pagavel> getContas(){
		return P;
	}
	public double calcularTotalContas() {
		double total = 0;
		for (Pagavel pagavel : P) {
			total += pagavel.calcularValorPagar();
		}
		return total;
	}
}
