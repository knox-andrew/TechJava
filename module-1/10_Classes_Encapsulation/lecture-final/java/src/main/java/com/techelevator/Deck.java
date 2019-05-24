package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	
	private List<Card> listOfCards = new ArrayList<Card>();
	
	public Deck() {
		for (String suit : Card.ALL_SUITS) {
			for (String rank : Card.ALL_RANKS) {
				listOfCards.add(new Card(suit, rank));
			}
		}
	}
	
	public Card deal() {
		Card dealtCard = null;
		if (listOfCards.size() > 0) {
			dealtCard = listOfCards.remove(0);
		}
		return dealtCard;
	}
	
	public void shuffle() {
		Collections.shuffle(listOfCards);
	}

}
