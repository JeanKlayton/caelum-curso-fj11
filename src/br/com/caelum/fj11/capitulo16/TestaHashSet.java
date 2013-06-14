package br.com.caelum.fj11.capitulo16;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {

	public static void main(String[] args) {
		Set<String> palavras = new HashSet<String>();
		palavras.add("java");
		palavras.add("ruby");
		palavras.add("java");
		palavras.add("delphi");
		
		System.out.println(palavras);
		palavras.contains("ruby");
	}
}
