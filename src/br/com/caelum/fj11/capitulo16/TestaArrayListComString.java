package br.com.caelum.fj11.capitulo16;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestaArrayListComString {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("java");
		palavras.add("ruby");
		palavras.add("python");
		palavras.add("php");

		System.out.println(palavras);
		System.out.println("Contem Ruby?: " + palavras.contains("ruby"));
		
		//Remover em ArrayList é custoso pq ele muda a posição dos elementos no array interno
		palavras.remove("php");
		System.out.println(palavras);
		
		//Imprimindo o conteúdo de determinada posição
		System.out.println(palavras.get(0));
	}
}
