package br.com.caelum.fj11.capitulo10;

public class Conta {

	private int numero;
	
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
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
	
}
