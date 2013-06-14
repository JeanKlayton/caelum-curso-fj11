package br.com.caelum.fj11.capitulo14;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero) {
		this.numero = numero;
	}

	@Override
	public void saca() {
	}

	@Override
	public String toString() {
		return "Conta de Numero: " + this.numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		//Nao esquecer de verificar o tipo
		if(!(obj instanceof Conta))
			return false;
		Conta conta = (Conta) obj;
		
		return conta.numero == this.numero;
	}
}
