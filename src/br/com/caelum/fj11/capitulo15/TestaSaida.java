package br.com.caelum.fj11.capitulo15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaSaida {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("file.txt");
		OutputStreamWriter writter = new OutputStreamWriter(os);
		BufferedWriter buffer = new BufferedWriter(writter);
		
		buffer.write("Java maroto");
		buffer.newLine();
		buffer.write("Ruby maroto");
		
		buffer.close();
	}
	
}
