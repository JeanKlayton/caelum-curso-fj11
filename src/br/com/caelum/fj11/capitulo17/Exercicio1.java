package br.com.caelum.fj11.capitulo17;

public class Exercicio1 {

	public static void main(String[] args) {
		Programa p1 = new Programa();
		p1.setId(1);
		Thread threadP1 = new Thread(p1);
		threadP1.start();
		
		Programa p2 = new Programa();
		p2.setId(2);
		Thread threadP2 = new Thread(p2);
		threadP2.start();
	}
}
