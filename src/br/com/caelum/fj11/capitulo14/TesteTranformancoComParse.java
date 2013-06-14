package br.com.caelum.fj11.capitulo14;

public class TesteTranformancoComParse {

	public static void main(String[] args) {
		parseDeStringParaInt();
		
		parseDeStringParaDouble();
		
		parseDeStringParaFloat();
	}

	private static void parseDeStringParaFloat() {
		String numero = "5";
		float f = Float.parseFloat(numero);
		System.out.println(f);
	}

	private static void parseDeStringParaDouble() {
		String numero = "2.5";
		double d = Double.parseDouble(numero);
		System.out.println(d);
	}

	private static void parseDeStringParaInt() {
		String numero = "50";
		int i = Integer.parseInt(numero); //Aqui podemos usar o método estático do Integer
		System.out.println(i);
	}
}
