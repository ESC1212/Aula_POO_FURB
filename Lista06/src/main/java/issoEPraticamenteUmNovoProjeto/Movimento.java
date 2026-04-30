package issoEPraticamenteUmNovoProjeto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Movimento {
	private double valor;
	private TipoMovimento tipoMovimento;
	private LocalDate data;
	private LocalTime hora;
	
	public Movimento(double valor, TipoMovimento tipoMovimento) {
		setValor(valor);
		setTipoMovimento(tipoMovimento);
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor <= 0)
			throw new IllegalArgumentException("Valor invalido");
		this.valor = valor;
	}
	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(TipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
