package br.com.caelum.fj11.capitulo14;

public class TesteComStrings {

	public static void main(String[] args) {
		simplesComparacaoDeStrings();
		
		simplesComparacaoDeStringsUsandoEquals();
		
		separandoAStringEmArray();
		
		comparandoStringComCompareTo();
		
		mostrandoComoStringEhImutavel();
	}

	private static void comparandoStringComCompareTo() {
		String string = "Java";
		String novaString = "Java";
		System.out.println(string.compareTo(novaString));
	}

	private static void separandoAStringEmArray() {
		String java = "Java e show";
		String[] array = java.split(" ");
		System.out.println(array[0] + array[1] + array[2]);
	}

	private static void simplesComparacaoDeStringsUsandoEquals() {
		String string1 = new String("FJ-11");
		String string2 = new String("FJ-11");
		
		//Agora fazemos a compatacao com equals, o que fica bem maroto! Será feita uma comparaçao de char em char
		if (string1.equals(string2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

	private static void simplesComparacaoDeStrings() {
		String string1 = new String("FJ-11");
		String string2 = new String("FJ-11");
		
		//Temos dois objetos diferentes e o resultado será este
		if (string1 == string2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

	private static void mostrandoComoStringEhImutavel() {
		String texto = "Java eh legal";
		texto.toUpperCase();
		System.out.println(texto); //O texto se manteve o mesmo, ou seja, o Java é maroto e não modifica a String original (String é imutável)
		
		String novaString = texto.toUpperCase();
		System.out.println(novaString); //Agora percebemos que o toUpperCase retorna a nova String
		
		texto.replaceAll("a", "i");
		System.out.println(texto); //Deu na mesma pois os métodos da classe String não modificam a String e retornam uma nova String, já modificada
		
		String replaceAll = texto.replaceAll("a", "i");
		System.out.println(replaceAll); //Agora temos a nova String
	}

}
