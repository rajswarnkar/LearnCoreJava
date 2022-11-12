package learnStrings;

public class StringImmutability {

	public StringImmutability() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//string is immutable. The concat method will not modify content of a1.
		String a1 = "rajesh";
		a1.concat(" Swarnkar");
		System.out.println(a1);
		System.out.println(a1.concat("Soni"));
		//String buffer is mutable
		StringBuffer sb1 = new StringBuffer("rajesh");
		sb1.append(" Swarnkar");
		System.out.println(sb1);
		
	}

}
