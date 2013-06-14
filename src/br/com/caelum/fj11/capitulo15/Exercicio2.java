package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt"); //Lembrar que aqui lemos byte e InputStream é abstrata
		InputStreamReader reader = new InputStreamReader(is); //Lembrar que aqui lemos char
		BufferedReader buffer = new BufferedReader(reader); //Lembrar que aqui lemos string
		
		String linha = buffer.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		buffer.close(); //Caso esqueçamos, o Eclipse nos lembrará de fechar
	}
}
