package br.com.caelum.fj11.capitulo14;

public class ContaComEquals {

	private int numero;

	public ContaComEquals(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		//Podemos verificar se o obj de fato é uma referência a um objeto do tipo ContaComEquals
		if(!(obj instanceof ContaComEquals))
			return false;
		
		ContaComEquals conta = (ContaComEquals) obj;
		
		if(conta.getNumero() == this.getNumero())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero;
	}
}
