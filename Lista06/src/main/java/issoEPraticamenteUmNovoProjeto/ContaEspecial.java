package issoEPraticamenteUmNovoProjeto;

public class ContaEspecial extends ContaBancaria {

	public ContaEspecial(String numero, double saldo, double limiteCredito) {
		super(numero, saldo);
		setLimiteCredito(limiteCredito);
	}
	
	private double limiteCredito;
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		if (limiteCredito <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public void sacar(double valor) {
		if ((super.getSaldo() + limiteCredito) < valor) 
			throw new IllegalArgumentException("Valor invalido");
		super.setSaldo(super.getSaldo() - valor);
	}
	
}
