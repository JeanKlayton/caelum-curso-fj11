package br.com.caelum.fj11.capitulo14;

import java.io.PrintStream;

public class TestaSystem {

	public static void main(String[] args) {
		//Podemos usar System.out.println() normalmente
		System.out.println("Simples Teste");
		
		//Tambem podemos "destrincha-lo", usando o atributo estatico e publico do System. Lembrar que ele nos retorna um PrintStream
		PrintStream out = System.out;
		out.println("Usando o atributo estático e público");
	}
}
