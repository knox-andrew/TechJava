package com.techelevator;

public class CardDemo {

	public static void main(String[] args) {
		
		Card myCard = new Card(Card.SUIT_SPADES, "Jack");
		Card anotherCard = new Card(Card.SUIT_HEARTS, "9");
		
		//System.out.println(myCard);
		
		myCard.flip();
		
		//System.out.println(myCard);
		
		myCard.flip();
		
		//System.out.println(myCard);
		
		
		Deck myDeck = new Deck();
		
		myDeck.shuffle();
		
		myCard = myDeck.deal();
		while (myCard != null) {
			myCard.flip();
			System.out.println(myCard);
			myCard = myDeck.deal();
		}
		

	}

}
