package interviewPrograms;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find sum of integers from a given string
		String str1 = "Code7'as'+87 2Poin";
		sumOfIntegersInString(str1);
	}
	
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

}
