package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Card {
	
	public static final String SUIT_SPADES = "Spades";
	public static final String SUIT_HEARTS = "Hearts";
	public static final String SUIT_CLUBS = "Clubs";
	public static final String SUIT_DIAMONDS = "Diamonds";
	
	public static final String[] ALL_SUITS = {SUIT_SPADES, SUIT_HEARTS, SUIT_CLUBS, SUIT_DIAMONDS};
	public static final String[] ALL_RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	
	public static final Map<String, Character> suitSymbols = initSuitSymbols();
	private static Map<String, Character> initSuitSymbols() {
		Map<String, Character> result = new HashMap<String, Character>();
		result.put(SUIT_SPADES, '\u2660');
		result.put(SUIT_HEARTS, '\u2661');
		result.put(SUIT_DIAMONDS, '\u2662');
		result.put(SUIT_CLUBS, '\u2663');
		
		return result;
	}
	
	
	private final String suit;
	private final String rank;
	private boolean faceUp = false;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getRank() {
		return rank;
	}
	
	public boolean isFaceUp() {
		return faceUp;
	} 

	public void flip() {
		faceUp = !faceUp;
	}
	
	@Override
	public String toString() {
		String result = "Back of Card";
		if (faceUp) {
			result = suitSymbols.get(suit) + rank;
		}
		return result;
	}

}
