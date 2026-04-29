package issoEPraticamenteUmNovoProjeto;

public class ContaBancaria {
	private String numero;
	private double saldo;
	private Cliente titular;
	
	public ContaBancaria(String numero, double saldo) {
		setNumero(numero);
		setSaldo(saldo);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if (numero == null||numero.isBlank())
			throw new IllegalArgumentException("Numero invalido");
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		if(titular == null)
			throw new IllegalArgumentException("Titular invalido"); 
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		if (valor <= 0)
			throw new IllegalArgumentException("Valor invalido");
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor <= 0 || saldo < valor)
			throw new IllegalArgumentException("Valor invalido");
		saldo -= valor;
	}
	
	public void transferir(ContaBancaria contaDestino, double valor) {
		if (contaDestino == null || valor <= 0 || contaDestino.getSaldo() <= 0)
			throw new IllegalArgumentException("Valor ou Conta invalida");
		saldo += valor;
		contaDestino.setSaldo(contaDestino.getSaldo() - valor);
	}
	
}
