package br.com.caelum.fj11.capitulo11;

public class TestaPilhaDeExecucao {

	public static void main(String[] args) {
		System.out.println("Inicio Main");
		metodo1();
		System.out.println("Fim Main");
	}

	private static void metodo1() {
		System.out.println("Inicio Main");
		metodo2();
		System.out.println("Fim Main");
	}

	private static void metodo2() {
		int[] dados = new int[10];
		for (int i = 0; i < 15; i++) {
			try {
				dados[i] = i;
				System.out.println(i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao inserir o registro " + i);
			}
		}
	}

}
