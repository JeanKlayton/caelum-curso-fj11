package br.com.caelum.fj11.capitulo10;

public class Retangulo implements AreaCalculavel {

	private int largura;
	private int lado;

	public Retangulo(int lado, int largura) {
		this.lado = lado;
		this.largura = largura;
	}
	
	@Override
	public double calculaArea() {
		return lado * largura;
	}

}
