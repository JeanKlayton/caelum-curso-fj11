package br.com.caelum.fj11.capitulo14;

public class TesteWrapper {

	public static void main(String[] args) {
		wrapperDeIntPrimitivoParaInteger();
		
		wrapperDeDoublePrimitivoParaDouble();
		
		unwrapperDeIntegerParaIntPrimitivo();
		
		autoBoxingAutomatico();
	}

	private static void autoBoxingAutomatico() {
		//Lembrar que este código não compila no Java 4, sendo disponível a partir do Java 5
		Integer numero = 5;
		int num = numero;
		System.out.println(num);
	}

	private static void unwrapperDeIntegerParaIntPrimitivo() {
		int i = 5;
		Integer integer = new Integer(i);
		int deVolta = integer.intValue();
		System.out.println(deVolta);
	}

	private static void wrapperDeDoublePrimitivoParaDouble() {
		double d = 3.8;
		Double numeroDouble = new Double(d);
		System.out.println(numeroDouble);
	}

	private static void wrapperDeIntPrimitivoParaInteger() {
		int i = 9;
		Integer integer = new Integer(i);
		System.out.println(integer);
	}
}
