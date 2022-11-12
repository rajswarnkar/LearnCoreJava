package interviewPrograms;

public class MaximumDifference {

	public MaximumDifference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = {34, -5, 12, 45, 93, 94, 74};
		int [] B = {-8, 83, 71, 9, 91, 74, 22};
		int len = 7;
		
		maxAbsoluteDiff(A,B,len);
		maxAbsoluteDiff2(A,B,len);
	}
	
	public static void maxAbsoluteDiff(int [] A, int [] B, int len) {
		
		int maxDiff = 0;
		
		for (int i=0; i<len;i++) {
			int temp = Math.abs(A[i]-B[i]);
			if (maxDiff < temp) maxDiff=temp;
		}
		System.out.println("Maximum difference is: "+maxDiff);
		
	}
	
	public static void maxAbsoluteDiff2(int [] A, int [] B, int len) {
		
		int maxDiff = 0;
		int num1=0;
		int num2=0;
	
		for (int i=0; i<len;i++) {
			for(int j =0;j<len;j++) {
				int temp = Math.abs(A[i]-B[j]);
				if (maxDiff < temp) {
					maxDiff=temp;
					num1 = A[i];
					num2 = B[j];
				}		
			}
		}
		System.out.printf("The number having max absoule diff are: %d, %d\n", num1, num2);
		System.out.println("Maximum difference is: "+maxDiff);
		
	}
}
