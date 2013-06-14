package br.com.caelum.fj11.capitulo14;

public class Exercicio2 {

	public static void main(String[] args) {
		verificandoUmaStringDentroDeOutra_ComIndexOf();
		
		verificandoUmaStringDentroDeOutra_ComContains();

		retirandoEspacosEmBrancoDeUmaString();
		
		verificandoSeUmaStringEstaVazia();
		
		verificandoQuantosCaracteresTemEmUmaString();
	}

	private static void verificandoSeUmaStringEstaVazia() {
		String texto = "Java eh muito maroto";
		System.out.println(texto.isEmpty());
		
		String textoVazio = "";
		System.out.println(textoVazio.isEmpty());
	}

	private static void verificandoUmaStringDentroDeOutra_ComIndexOf() {
		//Uma das formas de encontrar um texto em uma String é usando o método indexOf() que vai retornar -1 caso não encontre
		String texto = "Java eh muito maroto";
		if(texto.indexOf("maroto") != -1) {
			System.out.println("A string foi encontrada no texto");
		}
		else {
			System.out.println("A string nao foi encontrada");
		}
	}
	
	private static void verificandoUmaStringDentroDeOutra_ComContains() {
		//Outra forma mais interessante de verificar se uma string está contida em outra string
		String texto = "Java eh muito maroto";
		if(texto.contains("maroto")) {
			System.out.println("A string foi encontrada no texto");
		}
		else {
			System.out.println("A string nao foi encontrada");
		}
	}
	
	private static void retirandoEspacosEmBrancoDeUmaString() {
		String texto = "Java eh muito maroto";
		System.out.println(texto.replaceAll(" ", ""));
	}
	
	private static void verificandoQuantosCaracteresTemEmUmaString() {
		String texto = "Java eh muito maroto";
		System.out.println(texto.length());
	}
	
}
