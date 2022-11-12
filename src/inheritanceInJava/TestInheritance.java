package inheritanceInJava;

public class TestInheritance {

	public TestInheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritB objB = new MultipleInheritB();
		objB.show();
		objB.throwAway();
		objB.method1();
		
		MultipleInheritA objA = new MultipleInheritA();
		objA.show();
		objA.throwAway();
	}

}
