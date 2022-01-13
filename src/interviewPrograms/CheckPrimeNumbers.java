/**
 * 
 */
package interviewPrograms;

/**
 * @author e1077715
 *
 */
public class CheckPrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b=49;
		int []numbers = {49,0,4,19,33,2,61,97,63};
	
		isPrime(numbers);
		System.out.println(isPrime(49)); // false
	}

	private static void isPrime(int[] numbers) {
		// TODO Auto-generated method stub
		
		if (numbers.length>0) {
			
			for (int i=0;i<=numbers.length-1;i++) {
				
				if(numbers[i]==0 || numbers[i]==1) {
					System.out.println(numbers[i]+ " is not a prime number.");	
				}
				else if (numbers[i]==2) {
					System.out.println(numbers[i]+ " is a prime number.");		
				}
				else {
					int sqrt = (int) Math.sqrt(numbers[i]) + 1;
					for (int j = 2; j<sqrt; j++) {
						if(numbers[i] % j == 0) {
							System.out.println(numbers[i]+ " is a not a prime number.");
						}

					}
				}
					
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
