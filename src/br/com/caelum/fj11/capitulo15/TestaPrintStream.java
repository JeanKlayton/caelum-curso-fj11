package br.com.caelum.fj11.capitulo15;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaPrintStream {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		PrintStream printStream = new PrintStream(System.out);
		
		while (scanner.hasNextLine()) {
			printStream.print(scanner.nextLine());
		}
		scanner.close();
		printStream.close();
	}
}
