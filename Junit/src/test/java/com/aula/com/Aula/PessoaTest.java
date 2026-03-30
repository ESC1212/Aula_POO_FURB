package com.aula.com.Aula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void testCalculoImc() {
		Pessoa p = new Pessoa("Gumercindo", 80, 1.80);
		double esperado = 24.69;
		double tolerancia = 0.009;
		
		double resultado = p.calcularImc();
		
		assertEquals(esperado, resultado, tolerancia);
	}
	@Test
	void testeSetNomeInvalido() {
		Pessoa p = new Pessoa("Gumercindo", 80, 1.80);
		
		String mensagemEsperada = "Nome não pode ser vaziu";
		String NomeInvalido = "   ";
		
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {p.setNome(NomeInvalido);});
		
		assertEquals(mensagemEsperada, ex.getMessage());
		
	}
	
	@Test
	void testeSetPesoInvalido() {
		Pessoa p = new Pessoa("Gumercindo", 80, 1.80);
		
		String mensagemEsperada = "Peso invalido";
		double  PesoInvalido = 0;
		
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {p.setPeso(PesoInvalido);});
		
		assertEquals(mensagemEsperada, ex.getMessage());
		
	}
	
	@Test
	void testeSetAlturaInvalida() {
		Pessoa p = new Pessoa("Gumercindo", 80, 1.80);
		
		String mensagemEsperada = "Altura invalida";
		double  AlturaInvalida = 0;
		
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {p.setAltura(AlturaInvalida);});
		
		assertEquals(mensagemEsperada, ex.getMessage());
		
	}

}
