package com.techelevator;

import java.util.Scanner;

public class LuckyNumberBattle {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to LUCKY NUMBER BATTLE!");
		
		System.out.print("Enter Player 1's lucky numbers (space separated): ");
		String response = input.nextLine();
		String[] p1Numbers = response.split(" ");
		
		System.out.print("Enter Player 2's lucky numbers (space separated): ");
		response = input.nextLine();
		String[] p2Numbers = response.split(" ");
		
		if (p1Numbers.length == p2Numbers.length) {
			
			int p1Wins = 0;
			int p2Wins = 0;
			
			for(int i = 0; i < p1Numbers.length; i++) {
				System.out.print("Round " + (i + 1) + ": ");
				int p1Value = Integer.parseInt(p1Numbers[i]);
				int p2Value = Integer.parseInt(p2Numbers[i]);
				if (p1Value > p2Value) {
					System.out.println("Player 1 Wins!");
					p1Wins++;
				} else if (p2Value > p1Value) {
					System.out.println("Player 2 Wins!");
					p2Wins++;
				} else {
					System.out.println("It's a tie...");
				}
			}
				
			System.out.println();
			
			if (p1Wins > p2Wins) {
				System.out.println("Player 1 has achived VICTORY!");
			} else if (p2Wins > p1Wins) {
				System.out.println("Player 2 has TRIUMPHED!");
			} else {
				System.out.println("It's a draw...this time.");
			}
		}
		else {
			System.out.println("Can't have a battle with different amounts of lucky numbers!");
		}

	}

}
