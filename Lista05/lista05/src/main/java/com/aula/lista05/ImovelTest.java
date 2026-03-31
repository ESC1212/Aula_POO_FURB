package com.aula.lista05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImovelTest {

	@Test
	void testArea() {
		Imovel imovel =  new Imovel();
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {imovel.setArea(-5);});
	}
	@Test
	void testAreaNula() {
		Imovel imovel = new Imovel();
		
		Bairro bairro = new Bairro();
		bairro.setNome("Centro");
		bairro.setCoeficienteIptu(1);
		
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {imovel.calcularIptu();	});
		
	}

}
