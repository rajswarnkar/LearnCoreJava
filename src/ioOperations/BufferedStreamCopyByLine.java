package ioOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedStreamCopyByLine {

	public BufferedStreamCopyByLine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;
		
		String inputFile = "resources\\xanadu.txt";
		String outPutFile = "resources\\OutputFileBufferedByLine.txt";
		
		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			outputStream = new BufferedWriter(new FileWriter(outPutFile));
			String l;
			
			while ((l=inputStream.readLine())!= null) {
				System.out.println(l);
				outputStream.write(l);
				outputStream.newLine();
			}
		}
		finally {
			if	(inputStream != null) {inputStream.close();}
			if	(outputStream != null) {outputStream.close();}
		}
	}

}
