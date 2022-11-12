package interviewPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public FileHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(new File("Myfile"));
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception is "+e.toString());
			//System.out.println("Exception is "+e.getMessage());
		}
		
		System.out.println("hello");
		
	}
}
