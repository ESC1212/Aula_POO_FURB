package ex2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ContaBancaria[] contaBancaria = new ContaBancaria[2];
		
		for(int i = 0; i <2 ; i++) {
			String numero;
			String titular;
			System.out.println("Digite o numero da conta "+(i+1)+" : ");
			numero = s.nextLine();
			System.out.println("Digite o titular da primeira conta: ");
			titular = s.nextLine();
			ContaBancaria conta = new ContaBancaria(titular, numero);
			contaBancaria[i] = conta;
		}
		
		contaBancaria[0].depositarvalor(1000);
		contaBancaria[0].depositarvalor(700);
		
		contaBancaria[1].depositarvalor(5000);
		
		contaBancaria[1].sacar(3000);
		
		contaBancaria[1].transferir(contaBancaria[0], 1800);
		
		System.out.println("Titular: "+contaBancaria[0].getTitular()+" Saldo: R$"+contaBancaria[0].getSaldo());
		System.out.println("Titular: "+contaBancaria[1].getTitular()+" Saldo: R$"+contaBancaria[1].getSaldo());
	}
	
}
