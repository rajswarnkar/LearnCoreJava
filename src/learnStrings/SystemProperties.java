package learnStrings;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProperties {

	public SystemProperties() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		prop = System.getProperties();
		Enumeration<Object> keys = prop.keys();
		while (keys.hasMoreElements()) {
			String key = (String)keys.nextElement();
			String value = (String)prop.get(key);
			System.out.println("Key: "+ key + "   value: "+ value);
			
		}
		System.out.println("Hello");
}
}