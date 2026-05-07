package com.aula.Lista08;

public class PrevidenciaPrivada extends Investimento{
	
	private double valor;

	public PrevidenciaPrivada(double valor) {
		super();
		setValor(valor);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.valor = valor;
	}
	
	@Override
	public double calcularValorPagar() {
		
		return valor;
	}
	
	public void investir() {
		setSaldo(getSaldo()+valor);
	}
}
