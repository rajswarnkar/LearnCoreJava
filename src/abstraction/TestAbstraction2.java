package abstraction;

public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bike obj = new Honda();  
		 Honda objHonda = new Honda();
		 obj.changeGear();
		 obj.run();  
		 objHonda.changeGear();
		 objHonda.applyBreak();
	}

}

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  

  //class constructor
  Bike() {
	  System.out.println("bike is created");
	  
  }  
  abstract void run();  
  void changeGear(){System.out.println("gear is changed");} 
  void applyBreak() {System.out.println("Break is applied.");}
}

//Creating a Child class which inherits Abstract class  
class Honda extends Bike{
	@Override
	void run(){System.out.println("running safely..");} 
	
	void changeGear(){System.out.println("gear is Not changed");} 
}
