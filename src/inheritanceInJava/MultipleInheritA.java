package inheritanceInJava;

public class MultipleInheritA implements InterfaceT2 {

	public MultipleInheritA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritA obj = new MultipleInheritA();
		obj.show();
		obj.throwAway();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritA: Show me your beggage?");
		
	}

	@Override
	public void throwAway() {
		// TODO Auto-generated method stub
		System.out.println("MultipleInheritA: Throw the garbage away.");
		
	}

}
