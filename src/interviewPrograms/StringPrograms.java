package interviewPrograms;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find sum of integers from a given string
		String str1 = "Code7'as'+87 2Point";
		int len = str1.length();
		sumOfIntegersInString(str1);
		sumOfIntegersInString(str1,len);
	}
	
	//learn concept of Char to int using Character.getNumericValue()
	public static void sumOfIntegersInString(String str1) {
		int sum = 0;
		
		if (str1!=null && !str1.isBlank()) {
			
			for(int i=0;i<str1.length();i++) {
				char ch = str1.charAt(i);

				if(Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			
		}
		System.out.println("sum of integers is: " + sum);
		
	}

	//learn concept of Char to int using String.valueOf()
	public static void sumOfIntegersInString(String str1, int len) {
		int sum = 0;
		
		if (len > 0) {
			
			for(int i=0;i<str1.length();i++) {
				char ch = str1.charAt(i);

				if(Character.isDigit(ch)) {
					sum = sum + Integer.parseInt(String.valueOf(ch));
				}
			}
			
		}
		System.out.println("sum of integers is: " + sum);
		
	}
}
