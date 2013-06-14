package br.com.caelum.fj11.capitulo14;

public class GuardadorDeObjetos {

	private Object[] lista = new Object[100];
	
	private int ultimaPosicao = 0;
	
	public void adiciona(Object objeto) {
		lista[ultimaPosicao] = objeto;
		ultimaPosicao++;
	}

	public Object pegaObjetoDaPosicao(int posicao) {
		return lista[posicao];
	}

}
