package br.com.caelum.fj11.capitulo14;

public class ContaNormal {

	private int numero;

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero;
	}
}
