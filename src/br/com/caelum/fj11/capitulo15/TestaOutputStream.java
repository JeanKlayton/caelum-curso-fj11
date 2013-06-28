package br.com.caelum.fj11.capitulo15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaOutputStream {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("arquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter writer = new BufferedWriter(osw);
		
		writer.append("Alexandre");
		writer.newLine();
		writer.append("Gama");
		
		writer.close();
	}
}
