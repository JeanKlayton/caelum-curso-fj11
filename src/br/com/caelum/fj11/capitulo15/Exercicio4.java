package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
		String linha = buffer.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		buffer.close();
	}
}
