package br.com.caelum.fj11.capitulo15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Exercicio6 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader bufferReader = new BufferedReader(reader);
		
		OutputStream os = new FileOutputStream("file.txt");
		OutputStreamWriter writter = new OutputStreamWriter(os);
		BufferedWriter bufferWriter = new BufferedWriter(writter);
		
		String linha = bufferReader.readLine();
		while (linha != null) {
			bufferWriter.write(linha);
			bufferWriter.newLine();
			linha = bufferReader.readLine();
		}
		bufferReader.close(); //Se nao fecharmos o Eclipse dará um Warning
		bufferWriter.close();
	}
	
}
