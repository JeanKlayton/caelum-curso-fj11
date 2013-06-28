package br.com.caelum.fj11.capitulo14;

public class TestaSplit {

	public static void main(String[] args) {
		//Podemos dividir um texto em um array de Strings usando o metodo split da String
		String texto = "Java eh demais";
		String[] palavras = texto.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}
	}
}
