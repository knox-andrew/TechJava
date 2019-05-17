package com.techelevator;

import java.util.Scanner;

public class KilometerConverter {
	
	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		boolean done = false;
		while(done == false) {
		
		    //greet the user and prompt them to enter a start from, end with, and increment value
		    System.out.print("Enter a kilometer value to start at: ");
		    String value = input.nextLine();
		    int kilometerStart = Integer.parseInt(value);
	
		    System.out.print("Enter a kilometer value to end with: ");
		    value = input.nextLine();
		    int kilometerEnd = Integer.parseInt(value);
	
		    System.out.print("How many should it increment by: ");
		    value = input.nextLine();
		    int incrementBy = Integer.parseInt(value);
	
		    System.out.println("Going from " + kilometerStart + "km to " + kilometerEnd + 
		        "km in increments of " + incrementBy + "km.");
	
		    //print out each value converted into miles from start from to end with 
		    for (int i = kilometerStart; i <= kilometerEnd; i += incrementBy) {
		        double miles = kilometersToMiles(i);
		        System.out.println(i + "km is " + miles + "mi.");
		    }
		    
		    System.out.print("Do you want to stop (y/n)? ");
		    String answer = input.nextLine();
		    done = answer.equals("y");

	    
		}
	}

	static public double kilometersToMiles(int kilometers) {
	    double miles = kilometers * 0.621371;
	    return miles;
	}
	

}
