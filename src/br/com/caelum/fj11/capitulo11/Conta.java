package br.com.caelum.fj11.capitulo11;

public class Conta {

	private int numero;

	private double saldo;

	private double limite;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
