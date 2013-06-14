package br.com.caelum.fj11.capitulo14;

public class TesteTranformandoString1 {

	public static void main(String[] args) {
		transformandoInteiroEmStringPorContatenando();
		
		transformandoDoubleEmStringPorConcatenacao();
	}

	private static void transformandoDoubleEmStringPorConcatenacao() {
		double d = 2.5;
		String doubleEmString = "" + d;
		System.out.println(doubleEmString);
	}

	private static void transformandoInteiroEmStringPorContatenando() {
		int inteiro = 10;
		//String inteiroEmString = 10; Este código não compila
		String inteiroEmString = "" + inteiro;
		
		System.out.println(inteiroEmString);
	}
}
