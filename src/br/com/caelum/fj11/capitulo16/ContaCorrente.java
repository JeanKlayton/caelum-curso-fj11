package br.com.caelum.fj11.capitulo16;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

	public ContaCorrente(int numero) {
		this.setNumero(numero);
	}

	@Override
	public int compareTo(ContaCorrente conta) {
		if(this.getNumero() > conta.getNumero())
			return 1;
		else if(this.getNumero() < conta.getNumero())
			return -1;
		return 0;
	}

}
