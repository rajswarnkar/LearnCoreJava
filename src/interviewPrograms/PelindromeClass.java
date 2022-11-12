package interviewPrograms;

import java.util.Scanner;

public class PelindromeClass {

	public PelindromeClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aa b aa ";
		
		System.out.println(s + " is pelindrome string:"+ isPelindrome2(s));
	}	
	public boolean isPelindrome (String str) {
		
		if (str==null) {
			return false;
		}
		else
		{
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			return sb.toString().equals(str);
		}
		
	}
	
	//debug this method
    public static void isPelindrome(char [] chArr) {
    char [] chArr1 = chArr;
    for(int i=0; i <chArr1.length/2; i++) {
        char tempChar = chArr1[i];
        chArr1[i] = chArr[chArr1.length-i-1];
        chArr[chArr1.length-i-1] = tempChar;
    }
    if(chArr1.toString().contentEquals(chArr.toString())) System.out.println("Yes");
    else System.out.println("No");
}

	public static boolean isPelindrome2 (String str) {
		
		boolean isPelindrome2 = true;
		
		if (str==null) {
			isPelindrome2= false;
		}
		else
		{
			for(int i= 0, j=str.length()-1; i <str.length()/2 && j>=str.length()/2;i++,j--) {
				
				if(str.charAt(i)!=str.charAt(j)) 
					isPelindrome2 = false;
				else 
					isPelindrome2 = true;	
				
			}
		}
		return isPelindrome2;
	}
}
