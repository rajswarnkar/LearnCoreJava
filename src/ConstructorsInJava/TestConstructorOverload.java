package ConstructorsInJava;

public class TestConstructorOverload {

	public TestConstructorOverload() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in TestConstructorOverload");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		People p = new People();
		Employee e = new Employee();
		TestConstructorOverload tc = new TestConstructorOverload();
		
	}

}
