package com.capgemini.test;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Alex");
		names.add("Anna");
		names.add("Bob");
		names.add("Adam");
		names.add("Grant");

		// Iterating the collection
		//Iterator<String> it = names.iterator();
		
		/*while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}*/
		
		for(String name:names)
			System.out.println(name);
		

	}

}
