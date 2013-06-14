package br.com.caelum.fj11.capitulo14;

public class Exercicio3 {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
	}
}
