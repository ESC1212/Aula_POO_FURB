package com.aula.Lista08;

public class MensalidadeEnsino implements Pagavel{
	
	private int nrCreditos;
	private double precoCredito;
	
	public MensalidadeEnsino(int nrCreditos, double precoCredito) {
		setNrCreditos(nrCreditos);
		setPrecoCredito(precoCredito);
	}

	public int getNrCreditos() {
		return nrCreditos;
	}

	public void setNrCreditos(int nrCreditos) {
		if (nrCreditos <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.nrCreditos = nrCreditos;
	}

	public double getPrecoCredito() {
		return precoCredito;
	}

	public void setPrecoCredito(double precoCredito) {
		if (precoCredito <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.precoCredito = precoCredito;
	}

	@Override
	public double calcularValorPagar() {
		return nrCreditos * precoCredito;
	}
}
