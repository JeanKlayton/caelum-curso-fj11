package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaEntradaTeclado {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(isr);

		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
	}
	
}
