package learnStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPrograms {

	public StringPrograms() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "raa!r agon";
		FirstNonRepeatingChar(str1);

	}

	public static void FirstNonRepeatingChar(String str) {

		if (!str.isEmpty()) {
			List<Character> arrList = new ArrayList<Character>();
			char [] chArr = str.toCharArray();
			for (char a: chArr) {
				arrList.add(a);
				}
			System.out.println(arrList);
			for(char c: arrList) {
				int firstIndex = arrList.indexOf(c);
				int lstIndex = arrList.lastIndexOf(c);
				if(lstIndex == firstIndex) {
					System.out.println("First non-repeating character in string:"+str);
					System.out.println(c);
					break;
				}
			}
		} else {
			System.out.println(str + " is empty");
		}
	}
}
