package WarGame;

/*
 * @author Seth Oglesby and Scott Sakurai
 * February 4, 2020
 * Purpose: To simulate a fun game, played with cards.
 * Inputs: There are no inputs to simulate this game.
 * Outputs: The winner of the card game.
 */

public class Cards {
	private String rank;
	private String suit;
	private int value;
	public Cards(String rank, String suit, int value) {
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	//getter method
	public String getRank() {
		return rank;
	}//end getter method
	
	//getter method
	public String getSuit() {
		return suit;
	}//end getter method
	
	//getter method
	public int getValue() {
		return value;
	}//end getter method
	
	//setter method
	public void setCard(int value) {
		this.value = value;
	}//end setter method
	@Override
	//creates a string that combines the rank and the suit for the players
	public String toString() {
		return getRank() + " of " + getSuit();
	}//end toString

}//end Cards class
