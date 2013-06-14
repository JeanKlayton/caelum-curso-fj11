package br.com.caelum.fj11.capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(1);
		ContaCorrente conta2 = new ContaCorrente(5);
		ContaCorrente conta3 = new ContaCorrente(3);
		
		List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		
		System.out.println("Sem ordenação");
		for (ContaCorrente c : contas) {
			System.out.println(c.getNumero());
		}
		
		Collections.sort(contas);
		
		System.out.println("Com ordenação");
		for (ContaCorrente c : contas) {
			System.out.println(c.getNumero());
		}
	}
}
