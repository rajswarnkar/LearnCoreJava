package collectionsInJava;

import java.util.HashSet;

public class HashSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> dataHashSet = new HashSet<String>();
		
		dataHashSet.add("Pune");
	//	dataHashSet.add("");
		System.out.println("Size: "+dataHashSet.size() );
		System.out.println("HashCode: "+dataHashSet.hashCode());
		System.out.println("Values: "+dataHashSet);
		dataHashSet.add("Pune");
		dataHashSet.add("New Delhi");
		System.out.println("The HashSet does allow to have duplicate values");
		System.out.println("Values: "+dataHashSet);
		
		//converting a hashset to array
		
		String[] hashSetArray = dataHashSet.toArray(new String[dataHashSet.size()]);
		System.out.println("last value is "+hashSetArray[hashSetArray.length-1]);
		
		System.out.println("elements in hashset are:");
		for (String element:dataHashSet) {
			System.out.println(element);
		}

		
	}

}
