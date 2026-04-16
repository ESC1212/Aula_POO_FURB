package com.aula.Lista06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaEspecialTest {
	Cliente clienteOK = new Cliente("João Pão", "Rua Melancia");
	@Test
	void testeSaldoEspecialSacar() {
		ContaEspecial ce = new ContaEspecial("352375905", 0, 100);
		ce.depositar(20);
		ce.sacar(50);
		assertEquals(-30, ce.getSaldo());
	}
	@Test
	void testeSaldoEspecialLimite() {
		ContaEspecial ce = new ContaEspecial("352375905", 0, 100);
		ce.depositar(20);
		ce.sacar(120);
		assertEquals(-100, ce.getSaldo());
	}
	@Test
	void testeSaldoEspecialLimiteExedido() {
		ContaEspecial ce = new ContaEspecial("352375905", 0, 100);
		ce.depositar(20);
		IllegalArgumentException ex = new IllegalArgumentException("Valor invalido");
		assertEquals(ex, ce.sacar(120.01));
	}
}
