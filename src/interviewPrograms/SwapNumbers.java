/**
 * 
 */
package interviewPrograms;

/**
 * @author e1077715
 *
 */
public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int p = 100;
		int q = 80;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Value of a after swapping is "+a);
		System.out.println("Value of b after swapping is "+b);
		
		swap(p, q);
		System.out.printf("p is %d, q is %d", p, q);
	}

	private static void swap(int num1, int num2) {
		// TODO Auto-generated method stub
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
	}

}
