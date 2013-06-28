package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaInputStream {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader str = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(str);
		
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		
		reader.close();
	}
}
