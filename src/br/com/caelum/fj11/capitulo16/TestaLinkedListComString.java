package br.com.caelum.fj11.capitulo16;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class TestaLinkedListComString {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> palavras = new LinkedList<String>();
		palavras.add("java");
		palavras.add("ruby");
		palavras.add("python");
		palavras.add("php");
		palavras.add("java");

		System.out.println(palavras);
	}
}
