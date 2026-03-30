package ex2;

public class ContaBancaria {
	private String numero;
	private String titular;
	private double saldo;
	public static int agencia = 42;
	
	public ContaBancaria (String titural, String numero) {
		setTitular(titural);
		setNumero(numero);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if (numero == null || numero.isEmpty() || numero.isBlank()) {
			throw new IllegalArgumentException("Numero Invalido");
		}
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if (titular == null || titular.isEmpty() || titular.isBlank()) {
			this.titular = titular;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositarvalor(double valor){
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser maior que 0.");
		} else {
			saldo = saldo + valor;
		}
	}
	
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser maior que 0.");
		} else if(valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente.");
		} else {
			saldo = saldo - valor;
		}
	}
	
	public void transferir(ContaBancaria contaDestino, double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor tem que ser maior que 0.");
		} else if(valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente.");
		} else {
			saldo = saldo - valor;
			contaDestino.depositarvalor(contaDestino.getSaldo() + valor);
		}
	}
	
	
}