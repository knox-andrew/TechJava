package com.techelevator;

public class Person {
	
	private final String name;
	
	public static int numberOfEyes;
	
	public static final String GREETING = "Hello";
	
	public Person(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void sayName() {
		System.out.println(GREETING + " my name is " + name + " and I have " + numberOfEyes + " eyes.");
	}
	
	public static void addAnEye() {
		numberOfEyes++;
	}

}
