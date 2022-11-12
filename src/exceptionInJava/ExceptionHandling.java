package exceptionInJava;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testException();
	}
	
	public static void testException() {
		int number1, number2, a = 0;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a valid number: ");
		try {
			System.out.println("Enter 1st number:");
			number1 = reader.nextInt();
			System.out.println("Enter 2nd number:");
			number2 = reader.nextInt();
			System.out.println("1st number / 2nd number is: "+ number1/number2);
			a = 10;
			
		}
		catch (Exception e) {
			System.out.println("Exception has occured: "+ e.toString());
			System.out.println("Exception has occured: "+ e.getMessage());
			
		}
		finally {
			reader.close();
			System.out.println("I m final block");
			System.out.println(a);
		}
		System.out.println("Shall I be executed?");
		
	}

}
