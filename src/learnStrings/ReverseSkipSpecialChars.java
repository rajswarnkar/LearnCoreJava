package learnStrings;

import java.util.Arrays;

public class ReverseSkipSpecialChars {

	public ReverseSkipSpecialChars() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1  = "!R@A#J$e%s&H*1(0)2'1+k,u-M.a/R:S;w<A=r>n ?K[a]R^ i_s`a{g|e}n]tle M~an!";
		String s  = "!Raj#esh Kum@ar";
		char [] charArr = s.toCharArray();
		char [] tempArr = new char[s.length()];

		System.out.println("Before Reversal: "+s);
		
		//create an array of normal characters
		int x=0;
		for (int i = 0; i <= charArr.length - 1; i++) {
			
			if (!isSpecialChar (charArr[i])) {
				tempArr[x]=charArr[i];
				x++;
			}
			
			System.out.println("After each iteration: "+ Arrays.toString(tempArr));
		}
		System.out.println("After reversal: "+ Arrays.toString(tempArr));
		for (char c:tempArr) {
			System.out.println(c);
		}
	}
	
	public static boolean isSpecialChar(char ch) {
		
		boolean isSpecial = false;
		
		if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
			isSpecial = true;
		}
		
		return isSpecial;
	}
	
	public static void reverseString (String s) {
		
		
	}
	

}
