package com.techelevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> names = new ArrayList<String>();
		
		names.add("Kyle");
		names.add("Spencer");
		names.add("Andrew");
		names.add("Jill");
		names.add("Aaron");
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println(names.get(2));
		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Kyle");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
				
		names.add(2, "Amanda");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
				
		names.remove(0);
		names.remove("Andrew");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		
		boolean inList = names.contains("David");
		System.out.println("David is in the list of names: " + inList);
		inList = names.contains("Spencer");
		System.out.println("Spencer is in the list of names: " + inList);
		

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		
		String[] namesArray = names.toArray(new String[names.size()]);
		for (int i = 0; i < namesArray.length; i++) {
			System.out.println(namesArray[i]);
		}
		

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");
		
		List<Integer> intList;
		List<Double> doubleList;
		
		int count = 25;
		Integer quantity = new Integer(25);
		Integer piecesOfCake = new Integer("16");
		
		quantity = 12;
		
		boolean yes = true;
		boolean no = false;
		Boolean decision = null;
		decision = new Boolean(true);
		
		if (decision == false) {
			System.out.println("Nope.");
		}
		

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		
		for (String name : names) {
			System.out.println(name);
		}
		
		for (String name: namesArray) {
			System.out.println(name);
		}
		
		
		

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		
		Queue<String> priorities;
		priorities = new LinkedList<String>();
		
		priorities.offer("Clean the dishes");
		priorities.offer("Wash the counter");
		priorities.offer("Sweep the floor");
		priorities.offer("Scub the bathtub");
		
		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		
		while (priorities.size() > 0) {
			String nextPriority = priorities.poll();
			System.out.println("Next Priority: " + nextPriority);
		}
		
		priorities.offer("Walk the dog");
		
		String nextPriority;
		while ((nextPriority = priorities.poll()) != null) {
			System.out.println("Next Priority: " + nextPriority);
		}
		

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();
		
		
		Stack<String> browserStack = new Stack<String>();
		

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		
		
		browserStack.push("http://www.google.com");
		browserStack.push("http://www.techelevator.com");
		browserStack.push("http://www.stackoverflow.com");
		
		

		////////////////////
		// POPPING THE STACK
		////////////////////

		while (browserStack.size() > 0) {
			String previousPage = browserStack.pop();
			System.out.println("Previous Page: "  + previousPage);
		}
		
		
	}
}
