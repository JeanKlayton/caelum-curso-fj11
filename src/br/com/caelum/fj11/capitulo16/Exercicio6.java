package br.com.caelum.fj11.capitulo16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercicio6 {

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
		contas.add(conta4);
		
		System.out.print("Sequencia normal: ");
		for (ContaCorrente c : contas) {
			System.out.print(c.getNumero() + " ");
		}
		
		System.out.println("Frequencia da conta4: " + Collections.frequency(contas, conta4));
		
		System.out.println("Maximo: " + Collections.max(contas).getNumero());
		
		System.out.println("Embaralha: ");
		Collections.shuffle(contas);
		for (ContaCorrente c : contas) {
			System.out.print(c.getNumero() + " ");
		}
		
		System.out.println("\nRevertendo a lista: ");
		Collections.reverse(contas);
		for (ContaCorrente c : contas) {
			System.out.print(c.getNumero() + " ");
		}
		
	}
}
