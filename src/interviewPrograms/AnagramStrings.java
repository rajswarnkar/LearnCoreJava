package interviewPrograms;

import java.util.Arrays;

public class AnagramStrings {

	public AnagramStrings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Powe der";
		String s2 = "Powdere ";
		anagramUsingArrays(s1, s2);
	}
	
	public static void anagramUsingArrays(String s1, String s2) {
		char [] a1 = s1.toLowerCase().toCharArray();
		char [] a2 = s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		String sb1 = Arrays.toString(a1);
		String sb2 = Arrays.toString(a2);
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(s1 +" and " + s2 + " are anagram:"+(sb1.equals(sb2)));
	}

}
