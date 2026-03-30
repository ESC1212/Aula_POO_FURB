package com.aula.aula04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pessoa[] ps = new Pessoa[3];
		int rep = 0;
		
		while(rep < 3) {
			Pessoa p = new Pessoa();
			System.out.println("Digite seu nome: ");
			p.setNome(s.nextLine());
			System.out.println("Digite sual altura: ");
			p.setAltura(Double.valueOf(s.nextLine()));
			System.out.println("Digite sue peso: ");
			p.setPeso(Double.valueOf(s.nextLine()));
			ps[rep] = p;
			rep++;
		}
		
		s.close();
		rep--;
		
		while(rep >= 0) {
			Pessoa p = new Pessoa();
			p = ps[rep];
			System.out.println("\n");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Altura: " + p.getAltura());
			System.out.println("Peso: "  + p.getPeso());
			rep--;
		}
	}

}

