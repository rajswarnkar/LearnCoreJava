package learnStrings;

import java.util.Arrays;

public class StringOperations {

	public StringOperations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Rajesh Kumar Swarnkar";
		String [] split = str1.split("kumar");
		
		//printing content of Array without looping
		System.out.println(Arrays.toString(split));

		//return substring from beginIndex to endIndex-1;
		System.out.println(str1.substring(1, 3));
		
		System.out.println("My name is + \"Rajesh Kumar Swarnkar\"");
	}

}
