package inheritanceInJava;

//implements multiple interfaces and their parent interfaces

public class MultipleInheritB implements InterfaceT, InterfaceT2{

	public MultipleInheritB() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritB obj = new MultipleInheritB();
		obj.show();
		obj.throwAway();
		obj.method1();
		System.out.println(obj.method3());
	}

	@Override
	public void throwAway() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritB: Shall I throw?");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritB: Would you show me?");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritB: implements method1 of InterfaceT");
	}
	
}
