package ioOperations;

import java.util.Scanner;

public class ScannerClass {

	private static int B;
	private static int H;
	private static boolean flag;
	
	//this is the static initializer block. It is initialized at the time of loading the class even before the constructor
	static
	{
		 Scanner sc = new Scanner(System.in);
		  B = sc.nextInt();
		  H = sc.nextInt();
		  sc.close();
		  if (B> 0 && H > 0) { flag = true; }
			  
		else { flag = false;
				System.out.println("java.lang.Exception: Breadth and height must be positive");}
	}

	
	public ScannerClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		System.out.println(B);
		System.out.println(H);
		
	}

}
