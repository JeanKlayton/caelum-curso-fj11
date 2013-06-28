package br.com.caelum.fj11.capitulo15;

import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
}
