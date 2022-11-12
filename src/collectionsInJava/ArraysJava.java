package collectionsInJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrSize = 3;
		int ar[] = new int[arrSize];
		System.out.println(ar.length);

		Scanner reader = new Scanner(System.in);
		
		for (int i=0; i<arrSize;i++) {
			System.out.println("Enter an integer number:");
			int num = reader.nextInt();
			ar[i]=num;
		}
		
		reader.close();
		
		//print the content of the Array
		for (int j =0; j< ar.length;j++) {
			System.out.println(ar[j]);
		}
		
	}

}
