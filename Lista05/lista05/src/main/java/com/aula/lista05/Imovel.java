package com.aula.lista05;

public class Imovel {
	private String endereco;
	private int area;
	private Finalidade finalidade;
	private Bairro bairro;
	
	public void validarCamos() {
		
		if (finalidade == null)
			throw new IllegalArgumentException("Finalidade não pode estar vazia!");

		if (bairro == null)
			throw new IllegalArgumentException("Bairro não pode estar vaziu!");
		
		if (endereco == null || endereco.isBlank())
			throw new IllegalArgumentException("Endereço não pode estar vaziu!");
		
		if (area <= 0)
			throw new IllegalArgumentException("Area inválida");
		
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Finalidade getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;;
	}
	
	public double calcularIptu() {	
		validarCamos();
		double iptu = 0;
		
		switch(finalidade) {
			case RESIDENCIAL:
				iptu = area;
				break;
			case COMERCIAL:
				if (area <= 100) {
					iptu = 500;
					break;
				}
				if (area <= 400) {
					iptu = 100;
					break;
				}
				iptu = area * 2.55;
				break;
			case INDUSTRIAL:
				if (area <= 2000) {
					iptu = 1000;
					break;
				}
				iptu = 0.55 * area;
				break;
		}
		return iptu * bairro.getCoeficienteIptu();
	}
	
}
