package br.com.caelum.fj11.capitulo14;

public class TestaEquals {

	public static void main(String[] args) {
		comparandoDuasContasSemEquals();
		
		comparandoDuasContasComEquals();
	}

	private static void comparandoDuasContasSemEquals() {
		ContaSemEquals conta1 = new ContaSemEquals();
		ContaSemEquals conta2 = new ContaSemEquals();

		//Como sabemos, nesta comparacão será analisado se as contas apontam para a mesma referência e neste caso não 
		if (conta1 == conta2) {
			System.out.println("As contas sao Iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
	}
	
	private static void comparandoDuasContasComEquals() {
		ContaComEquals conta1 = new ContaComEquals(1);
		ContaComEquals conta2 = new ContaComEquals(1);
		
		if (conta1.equals(conta2)) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas são diferentes");
		}
	}
	
}
