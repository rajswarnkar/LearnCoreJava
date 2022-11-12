package learnStrings;

public class ReverseStringRecursion {
	
	static String revStr = "";

	public ReverseStringRecursion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "r88D54-*)-g";
		System.out.println("reversed string is:"+revString(str));
		System.out.println("reversed string is:"+reverseString(str));
	}
	
	static String revString(String orgStr) {
		String temp;
		//StringBuffer sb = new StringBuffer(orgStr);
		if (orgStr.isBlank()) {return orgStr; }
		else {
				int lastIndex = orgStr.length();
				if (lastIndex > 0) {
					revStr = revStr+orgStr.charAt(lastIndex-1);
					revString(orgStr.substring(0, (lastIndex-1)));
					}
				else {
					revStr = revStr + orgStr.charAt(0);
				}
				return revStr;
		}
		
	}
	
	static String reverseString(String orgStr) {
		if (orgStr.isBlank()) {return orgStr; }
		else {
				return reverseString(orgStr.substring(1))+orgStr.charAt(0);
		}
		
	}

}
