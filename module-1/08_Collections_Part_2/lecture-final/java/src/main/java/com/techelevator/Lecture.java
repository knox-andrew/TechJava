package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		Map<String, String> nameToZip;
		nameToZip = new HashMap<String, String>();
		
		nameToZip.put("David", "45208");
		nameToZip.put("Delaney", "41042");
		nameToZip.put("Aaron", "45320");
		
		System.out.println("David lives in " + nameToZip.get("David"));
		System.out.println("Aaron lives in " + nameToZip.get("Aaron"));
		System.out.println();
		
		nameToZip.put("David", "90210");
		
		
		for (String name : nameToZip.keySet()) {
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		
		System.out.println();
		
		nameToZip.remove("David");
		
		for (String name : nameToZip.keySet()) {
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		
		if (nameToZip.containsValue("90210")) {
			System.out.println("Someone lives in Beverly Hills.");
		}
		if (nameToZip.containsKey("Aaron")) {
			System.out.println("Currently tracking Aaron's location.");
		}
		
		
		Map<String, Integer> nameToAge = new HashMap<String, Integer>();
		nameToAge.put("George", 25);
		nameToAge.put("Mary", 33);
		nameToAge.put("Fred", 12);
		nameToAge.put("Sally", 9);
		
		if (nameToAge.get("George") > nameToAge.get("Fred")) {
			System.out.println("George is older than Fred.");
		}
		
		nameToAge.put("Sally", 10);
		
		int age = nameToAge.get("Sally");
		nameToAge.put("Sally", age + 1);
	
		nameToAge.put("Sally", nameToAge.get("Sally") + 1);
		
		boolean knowsMarysAge = nameToAge.containsKey("Mary");
		
		

		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();
		
		Set<String> desserts = new HashSet<String>();


		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();
		
		
		desserts.add("cookies");
		desserts.add("cake");
		desserts.add("pie");
		desserts.add("cake");
		
		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();
		
		
		for (String dessert : desserts) {
			System.out.println(dessert);
		}

		

	}

}
