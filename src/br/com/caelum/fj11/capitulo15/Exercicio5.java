package br.com.caelum.fj11.capitulo15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) throws IOException {
		lendoArquivoComScanner();
		
		lendoDoTecladoComScanner();
	}

	private static void lendoDoTecladoComScanner()
			throws FileNotFoundException, IOException {
		System.out.println("Lendo do teclado:");
		InputStream is = System.in;
		Scanner scanner = new Scanner(is);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		is.close();
	}

	private static void lendoArquivoComScanner() throws FileNotFoundException,
			IOException {
		System.out.println("Lendo o arquivo:");
		InputStream is = new FileInputStream("arquivo.txt");
		
		Scanner scanner = new Scanner(is);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		is.close();
		System.out.println("");
	}
}
