package collectionsInJava;

import java.util.HashMap;

public class HashMapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put(null, null);
		hashMap.put(null, "New Value");
		hashMap.put("2", null);
		hashMap.put("3", "New Value1");
		hashMap.put("4", null);
		System.out.println(hashMap.values());
		System.out.println(hashMap.get("3"));
		System.out.println(hashMap.get("5"));
	}

}
