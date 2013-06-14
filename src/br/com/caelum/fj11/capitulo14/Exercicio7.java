package br.com.caelum.fj11.capitulo14;

public class Exercicio7 {

	public static void main(String[] args) {
		ContaCorrente contaA = new ContaCorrente(1);
		ContaCorrente contaB = new ContaCorrente(1);
		if (contaA.equals(contaB)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}
	
}
