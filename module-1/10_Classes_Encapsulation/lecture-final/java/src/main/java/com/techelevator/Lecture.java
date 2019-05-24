package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("George");
		
		Person p2 = new Person("Martha");
		
		p1.sayName();
		p2.sayName();
		
		Person.numberOfEyes = 8;
		
		p1.sayName();
		p2.sayName();
		
		Person.addAnEye();
		
		p1.sayName();
		p2.sayName();

	}

}
