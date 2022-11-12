package oopsMiscellaneous;

public class TestWrapperClass1 {

	public TestWrapperClass1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WrapperClass1 testWrapper = new WrapperClass1(20);
		System.out.println(testWrapper);
		
		Integer I = Integer.valueOf(10);
		System.out.println(I);
		
		System.out.println(String.valueOf(20));
		System.out.println(Integer.parseInt("1111", 2));
		System.out.println(Integer.valueOf("1111", 3));
		System.out.println(Integer.toString(25, 2));
	}

}
