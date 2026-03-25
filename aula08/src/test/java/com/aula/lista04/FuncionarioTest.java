package com.aula.lista04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionarioTest {

	@Test
	void testeSalarioPrimeiraFaixa() {
		Funcionario f = new Funcionario("João Pão", 850);
		FaixaIrpf esperado = FaixaIrpf.PRIMEIRA;
		FaixaIrpf resultado = f.identificarFaixa();
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testeCalcularPrimeiraFaixa() {
		Funcionario f = new Funcionario("João Pão", 850);
		double  esperado = 0;
		double tolerancia = 0.009;
		double resultado = f.calcularIrpf();
		assertEquals(esperado, resultado, tolerancia);
	}
	
	@Test
	void testRecusarSalarioNegativo() {
		String nome = "João Pão";
		double salario = -100;
		String mensagemEsperada = "Salario invalido";
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {new Funcionario(nome, salario);});
		assertEquals(mensagemEsperada, ex.getMessage());
	}

}
