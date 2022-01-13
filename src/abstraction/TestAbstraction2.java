package abstraction;

public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bike obj = new Honda();  
		 obj.run();  
		 obj.changeGear(); 
	}

}

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  
  Bike(){System.out.println("bike is created");}  
  abstract void run();  
  void changeGear(){System.out.println("gear changed");}  
}

//Creating a Child class which inherits Abstract class  
class Honda extends Bike{  
void run(){System.out.println("running safely..");}  
}
