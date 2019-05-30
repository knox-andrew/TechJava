package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OldMacdonald {
	public static void main(String[] args) {
		
		Singable[] farmStuff = new Singable[] { new Cow(), new Chicken(), new Pig(), new Tractor()};
		
		for(Singable stuff : farmStuff) {
			String name = stuff.getName();
			String sound = stuff.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+sound+" "+sound+" here");
			System.out.println("And a "+sound+" "+sound+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			
			if (stuff instanceof Sellable) {
				Sellable merchandise = (Sellable) stuff;
				System.out.println("And you can buy that " + name + " for only $" + merchandise.getPrice() + "!");
			}
			
			System.out.println();
		}
		
		Sellable item = new Corn();
		System.out.println("Buy some corn for just $" + item.getPrice());
		
		List<Edible> menu = new ArrayList<Edible>();
		Edible food = new Corn();
		menu.add(food);
		
		Random rand = new Random();
		int luckyNumber = rand.nextInt(100) + 1; //number from 1-100
		System.out.println(luckyNumber);
		
		double luckyDouble = rand.nextDouble();
		System.out.println(luckyDouble);
		System.out.format("%.2f\n", luckyDouble);
		
		System.out.format("%-20s%-20s%-20s\n", farmStuff[0].getName(), farmStuff[1].getName(), farmStuff[2].getName());
		System.out.format("%-20s%-20s%-20s\n", farmStuff[1].getName(), farmStuff[2].getName(), farmStuff[0].getName());
		
		
		
	}
}