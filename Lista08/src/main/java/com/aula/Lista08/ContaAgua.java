package com.aula.Lista08;

public class ContaAgua implements Pagavel{
	
	private int metrosCubicos;
	private double precoMetroCubico;
	
	public ContaAgua(int metrosCubicos, double precoMetroCubico) {
		setMetrosCubicos(metrosCubicos);
		setPrecoMetroCubico(precoMetroCubico);
	}

	public int getMetrosCubicos() {
		return metrosCubicos;
	}

	public void setMetrosCubicos(int metrosCubicos) {
		if (metrosCubicos <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.metrosCubicos = metrosCubicos;
	}

	public double getPrecoMetroCubico() {
		return precoMetroCubico;
	}

	public void setPrecoMetroCubico(double precoMetroCubico) {
		if (precoMetroCubico <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.precoMetroCubico = precoMetroCubico;
	}

	@Override
	public double calcularValorPagar() {
		return metrosCubicos * precoMetroCubico;
	}

}
