package br.com.caelum.fj11.capitulo15;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		Scanner scanner = new Scanner(is);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}
}
