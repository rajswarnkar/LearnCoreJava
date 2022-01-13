package learnStrings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello Rajesh";
		System.out.println("Reversed string is: "+ reverse(str));
		
		//quick way to reverse String in Java - Use StringBuffer
		String word = "HelloWorld";
		String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
     
        //another quick way to reverse String in Java - use StringBuilder
        word = "WakeUp";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
		
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		StringBuilder  reversedString;
		if (str==null || str.isEmpty()) {
			
			throw new IllegalArgumentException ("Null is not a valid input");
			
		}
		else
		{
			reversedString = new StringBuilder();
			System.out.println(reversedString);
			
			char [] charArr = str.toCharArray();
			String reversedString1="";
			System.out.println(charArr.length);
			
			for (int i=charArr.length-1;i>=0;i--) {
				reversedString1=reversedString1+charArr[i];
				reversedString.append(charArr[i]);
				System.out.println(reversedString1);
			}
		}
		return reversedString.toString();
	}

}
