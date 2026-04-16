package com.aula.Lista06;

public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isBlank())
			throw new IllegalArgumentException("Nome invalido");
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco == null || endereco.isBlank())
			throw new IllegalArgumentException("Endereço invalido");
		this.endereco = endereco;
	}
}
