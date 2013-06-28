package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntradaArquivo {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt"); //O FileInputStream só sabe ler byte. Lembrar que InputStream é abstrata
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader buffer = new BufferedReader(reader);
		 
		String s = buffer.readLine();
		while (s != null) {
			System.out.println(s);
			s = buffer.readLine();
		}
		buffer.close();
	}
	
}
