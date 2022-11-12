package collectionsInJava;

import java.util.Vector;

public class VectorJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaVector();
	}
	
	public static void javaVector() {
		
		Vector<String> vc = new Vector<String>();
		System.out.println("vector initial capacity:" + vc.capacity());
		vc.add("Delhi");
		vc.add("Pune");
		vc.add(1, "Mumbai");  //shift element at index 1 to the right by 1 position.
		vc.add(3,"Jhansi");
		vc.add(4,"Agra");
		vc.add(5,"Udaipur");
		vc.add(6,"Datia");
		System.out.println("Content of vector:" + vc.toString());
		vc.setSize(8);

		System.out.println("vector capacity:" + vc.capacity());
		System.out.println("vector Size:" + vc.size());
		System.out.println("First element:" + vc.firstElement());
		System.out.println("Last element:" + vc.lastElement());
		System.out.println("Element at Zero Index:" + vc.get(0));
		System.out.println("Element at Last Index:" + vc.get(vc.size()-1));
		System.out.println("Content of vector:" + vc.toString());
	}

}
