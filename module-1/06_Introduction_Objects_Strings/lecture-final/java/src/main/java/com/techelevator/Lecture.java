package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		
		
		String example = "This is an example of a String.";
		
		example = example + " And here's some more text.";
		
		System.out.println(example);
		

		
		String useless = new String();
		String empty = "";
		
		
		
		String firstName = "David";
		String lastName = "Pfaltzgraff-Carlson";
		String fullName = firstName.concat(" ").concat(lastName);
		System.out.println(fullName);
		
		
		System.out.println(firstName.length());
		
		System.out.println("blah blah blah".length());
		
		
		
		String sentence = "It was a dark and stormy night...";
		System.out.println(sentence.substring(0, 2));
		System.out.println(sentence.substring(18, 23));
		System.out.println(sentence.substring(25));
		
		
		System.out.println(sentence.indexOf("dark"));
		System.out.println(sentence.indexOf("sunny"));
		System.out.println(sentence.indexOf("s"));
		System.out.println(sentence.indexOf("s", 6));
		
		
		
		String today = "Monday";
		System.out.println(today.charAt(3));
		
		
		String story = "Once upon a time there was a princess.";
		System.out.println(story.contains("princess"));
		System.out.println(story.contains("prince"));
		
		
		char[] cityNameArr = new char[] {'N','o','r','w','o','o','d'};
		String cityNameStr = new String(cityNameArr);
		System.out.println(cityNameStr);
		
		String meBrag = "I am so awesome!";
		String youBrag = meBrag.replace("I am", "You are");
		System.out.println(meBrag);
		System.out.println(youBrag);
		
	
		//The wrong way
		System.out.println(cityNameStr == "Norwood"); //false
		System.out.println(today == "Monday"); //true because of the use of literal strings
		
		//The right way
		System.out.println(cityNameStr.equals("Norwood")); 
		System.out.println("Norwood".equals(cityNameStr));
		
		System.out.println(today.equalsIgnoreCase("monday"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
