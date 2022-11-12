package ioOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharStreamCopyByLine {

	public CharStreamCopyByLine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		String inputFile = "resources\\xanadu.txt";
		String outPutFile = "resources\\OutputFileByLine.txt";
		
		try {
			inputStream = new BufferedReader(new FileReader(inputFile));
			outputStream = new PrintWriter(new FileWriter(outPutFile));
			String l;
			
			while ((l=inputStream.readLine())!= null) {
				System.out.println(l);
				outputStream.println(l);
			}
		}
		finally {
			if	(inputStream != null) {inputStream.close();}
			if	(outputStream != null) {outputStream.close();}
		}
	}

}
