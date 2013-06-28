package br.com.caelum.fj11.capitulo17;

import java.util.HashSet;
import java.util.Set;

public class Exercicio7 {

	public static void main(String[] args) {
		Set<Conta> contas = new HashSet<Conta>();
		Conta conta1 = new Conta(1);
		contas.add(conta1);
		Conta conta2 = new Conta(2);
		contas.add(conta2);
		
		System.out.println(contas.contains(conta1));
	}
	
}
