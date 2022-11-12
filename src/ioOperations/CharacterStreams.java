package ioOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

	public CharacterStreams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader inputFl = null;
		FileWriter outputFw = null;
		
		String inputFile = "resources\\xanadu.txt";
		String outPutFile = "resources\\OutputFileByChar.txt";
		
		try {
			
			inputFl = new FileReader(inputFile);
			outputFw = new FileWriter(outPutFile);
			int c;
			
			while ((c=inputFl.read())!=-1) {
				System.out.println(c);
				outputFw.write(c);
			}
			
		}
		finally {
				if(inputFl != null) {inputFl.close();	}
				if(outputFw != null) {outputFw.close();	}
		}
	}

}
