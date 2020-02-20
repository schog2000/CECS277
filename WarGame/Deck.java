package WarGame;
/*
 * @author Seth Oglesby and Scott Sakurai
 * February 4, 2020
 * Purpose: To simulate a fun game, played with cards.
 * Inputs: There are no inputs to simulate this game.
 * Outputs: The winner of the card game.
 */

import java.util.ArrayList;
import java.util.Collections;
public class Deck {
	private ArrayList<Cards> deck = new ArrayList<Cards>(); //creates an array list for the deck
	public void deck() {
		ArrayList<String> rank = new ArrayList<String>();//array list that stores each card face value
		
		//adds string to array list
		rank.add("2");
		rank.add("3");
		rank.add("4");
		rank.add("5");
		rank.add("6");
		rank.add("7");
		rank.add("8");
		rank.add("9");
		rank.add("10");
		rank.add("Jack");
		rank.add("Queen");
		rank.add("King");
		rank.add("Ace");
		
		ArrayList<String> suit = new ArrayList<String>(); // array list that stores the four suits
		//adds suits to array list
		suit.add("Clubs");
		suit.add("Spades");
		suit.add("Hearts");
		suit.add("Diamonds");
		int count = 2;
		//loop that adds face, suit, and the value of each card
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				deck.add(new Cards(rank.get(i),suit.get(j),count));
			}//end for
			count+=1;//add the value of the card for ranking
		}//end for
	}//end deck method
	
	//method to randomize the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}
	//method to deal the cards to player 1
	public ArrayList<Cards> dealPlayerOne() {
		int splitDeck = deck.size()/2;
		ArrayList<Cards> player1 = new ArrayList<Cards>();
		for(int i=0;i<splitDeck;i++) {
			player1.add(deck.get(i));
		}//end for
		return player1;
	}//end deal method
	
	//method to deal the cards to player 2
	public ArrayList<Cards> dealPlayerTwo() {
		int splitDeck = deck.size()/2;
		ArrayList<Cards> player2 = new ArrayList<Cards>();
		for(int i=splitDeck;i<52;i++) {
			player2.add(deck.get(i));
		}//end for
		return player2;
	}//end deal method

}//end deck class
