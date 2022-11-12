package collectionsInJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrList1();
		arrListAsList();
		//listSublist();
	}
	
	public static void arrList1() {
		String city;
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		System.out.println("initial size of array list: "+arrList.size());
		Scanner reader = new Scanner(System.in);
		
		//get input
		
		for (int i=0; i <4;i++) {
			System.out.println("Enter name of cities");
			city = reader.next();
			arrList.add(city);
			
		}
		System.out.println(arrList.toString());
		reader.close();
		
		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("haryana");
		arrList2.add("Gurugram");
		
		arrList.addAll(arrList2);
		System.out.println(arrList.toString());
		System.out.println(arrList.toArray());
		
		System.out.println(arrList.contains("Delhi"));
		
	}

	public static void arrListAsList() {
		
		List<Integer> listNumber = new ArrayList<Integer>();
		listNumber.add(12);
		listNumber.add(1, 17);
		System.out.println(listNumber);
		ArrayList <Object> objList = new ArrayList<Object>();
		objList.add("string");
		objList.add(12);
		objList.add(92.192);
		System.out.println(objList);
		
		List<String> lstThings = Arrays.asList("Fan","MobilePhone","Watch");
		System.out.println(lstThings);

	}
	
	public static void listSublist() {
		ArrayList<String> al = new ArrayList<String>();
		
	     //Addition of elements in ArrayList
	     al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");

	     System.out.println("Original ArrayList Content: "+al);

	     //Sublist to ArrayList
	     //Sublist method returns a List from begin index to last index-1;
	     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
	     System.out.println("SubList stored in ArrayList: "+al2);
	     
	     //Sublist to List
	     List<String> list = al.subList(1, 4);
	     System.out.println("SubList stored in List: "+list);

	}




}
