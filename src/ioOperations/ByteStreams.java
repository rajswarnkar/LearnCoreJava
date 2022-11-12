package ioOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

	public ByteStreams() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream in = null;
		FileOutputStream out = null;
		String inputFile = "resources\\xanadu.txt";
		String outPutFile = "resources\\OutputFileByte.txt";
		
		try {
				in = new FileInputStream(inputFile);
				out = new FileOutputStream(outPutFile);
				int c;
				
				//here in.read() is returning ascii value of each character
				while ((c = in.read()) != -1) {
					//type casting to get char from ASCII integer value.
					System.out.println((char)c);
					out.write(c);
				}
		} 
		finally { 
				if(in != null) {
					in.close();
				}
				
				if (out != null) {
					out.close();
				}
			
		}
	}

}
