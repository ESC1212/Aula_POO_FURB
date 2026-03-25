package com.aula.exRelacionamentos;

public class Carro {
	public Carro(String marca, String modelo, Pessoa motorista) {
		setMarca(marca);
		setModelo(modelo);
		setMotorista(motorista);	
	}
	
	private String marca;
	private String modelo;
	private Pessoa motorista;
	
	public Pessoa getMotorista() {
		return motorista;
	}
	public void setMotorista(Pessoa motorista) {
		this.motorista = motorista;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
