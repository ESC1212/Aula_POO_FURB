package issoEPraticamenteUmNovoProjeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaBancariaTest {

	@Test
	void testeMovimento() {
		ContaBancaria cb = new ContaBancaria("5635", 0);
		cb.depositar(1000);
		cb.sacar(250);
		assertEquals(TipoMovimento.CREDITO, cb.getMovimento().get(0).getTipoMovimento());
		assertEquals(1000, cb.getMovimento().get(0).getValor());
		assertEquals(TipoMovimento.DEBITO, cb.getMovimento().get(1).getTipoMovimento());
		assertEquals(250, cb.getMovimento().get(1).getValor());
	}

}
