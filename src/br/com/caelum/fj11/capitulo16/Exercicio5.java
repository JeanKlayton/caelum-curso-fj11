package br.com.caelum.fj11.capitulo16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercicio5 {

	public static void main(String[] args) {
		List<ContaCorrente> contas = new LinkedList<ContaCorrente>();
		ContaCorrente conta1 = new ContaCorrente(1);
		ContaCorrente conta2 = new ContaCorrente(4);
		ContaCorrente conta3 = new ContaCorrente(8);
		ContaCorrente conta4 = new ContaCorrente(3);
		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);
		
		Collections.rotate(contas, 4);
		for (ContaCorrente c : contas) {
			System.out.println(c.getNumero());
		}
	}
}
