package exceptionInJava;

public class testClass {

	public testClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = div(2, 0);
			System.out.print("A");
			
		}
		catch (Exception Ex){
			System.out.print("B");
		}
		finally {
			System.out.print("C");
		}
		System.out.print("D");
	}
	
	static int div(int a, int b) {
		return a/b;
	}
}
