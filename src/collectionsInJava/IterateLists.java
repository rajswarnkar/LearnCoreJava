package collectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterateLists {

	public IterateLists() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	iterateArrayList();
	//	forEachArrayList();
		sortArrayList();
	}

	public static void iterateArrayList() {

		ArrayList<String> arrListCities = new ArrayList<String>();
		
		System.out.println("Default Capacity of arrListCities is "+ arrListCities.size());
		int size = 100;
		arrListCities.ensureCapacity(size);

		arrListCities.add("Ahmedabad");
		arrListCities.add("Bombay");
		System.out.println("Capacity of arrListCities is "+ arrListCities.size());
		arrListCities.add("Chandigarh");
		arrListCities.add("Daman");
		arrListCities.add("Ellur");
		arrListCities.add(null);
		arrListCities.add(" ");

		Iterator<String> itr = arrListCities.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		arrListCities.trimToSize();
		System.out.println("Capacity of arrListCities after trimming "+ arrListCities.size());
		
		arrListCities.forEach(t -> System.out.println("City "+t));
	}
	
	public static void forEachArrayList() {

		ArrayList<String> arrListCities = new ArrayList<String>();
		
		System.out.println("Default Capacity of arrListCities is "+ arrListCities.size());
		int size = 100;
		arrListCities.ensureCapacity(size);

		arrListCities.add("Ahmedabad");
		arrListCities.add("Bombay");
		arrListCities.add("Chandigarh");
		arrListCities.add("Daman");
		arrListCities.add("Ellur");
		arrListCities.add(null);
		arrListCities.add(" ");
		System.out.println("elements in the arrayList "+ arrListCities.size());
		arrListCities.forEach(t -> System.out.println("City "+t));
		Collections.reverse(arrListCities);
	}
	
	public static void sortArrayList() {

		ArrayList<String> arrListCities = new ArrayList<String>();
		
		System.out.println("Default Capacity of arrListCities is "+ arrListCities.size());
		int size = 100;
		arrListCities.ensureCapacity(size);

		arrListCities.add("Ahmedabad");
		arrListCities.add("Bombay");
		arrListCities.add("Kota");
		arrListCities.add("Daman");
		arrListCities.add("Ellur");
		arrListCities.add(" ");
		arrListCities.add("Chandigarh");
		
		System.out.println("elements in the arrayList "+ arrListCities.size());
		
		/**all the elements in the list must implement Comparable interface and 
		elements must be mutually comparable for sort() or reverse() method **/
		
		System.out.println("Cities in Ascending order: ");
		Collections.sort(arrListCities);
		arrListCities.forEach(t -> System.out.println("City "+t));
		
		System.out.println("Cities in Decending order: ");
		Collections.reverse(arrListCities);
		arrListCities.forEach(t -> System.out.println("City "+t));
	}

}
