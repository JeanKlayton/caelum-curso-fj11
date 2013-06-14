package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in; //Podemos ler do teclado usando System.in
		InputStreamReader reader = new InputStreamReader(is); //Aqui lemos char pelo InputStreamReader
		BufferedReader buffer = new BufferedReader(reader); //Aqui conseguimos ler uma String
		
		String linha = buffer.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		buffer.close();
	}
}
