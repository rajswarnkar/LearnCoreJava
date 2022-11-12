package inheritanceInJava;

public class ChildClassB extends ParentClassB implements InterfaceT{

	public ChildClassB(){
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassB cc = new ChildClassB();
		//ChildClassB cp = new ParentClassB();
		ParentClassB pp = new ParentClassB();
		ParentClassB pc = new ChildClassB();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I am in class "+this.getClass());
		
	}
	
}
