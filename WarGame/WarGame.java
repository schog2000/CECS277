package WarGame;
/*
 * @author Seth Oglesby and Scott Sakurai
 * February 4, 2020
 * Purpose: To simulate a fun game, played with cards.
 * Inputs: There are no inputs to simulate this game.
 * Outputs: The winner of the card game.
 */

import java.util.ArrayList;
public class WarGame {

	public static void main(String[] args) {
		Deck callDeck = new Deck();
		callDeck.deck();
		callDeck.shuffle();
		
		ArrayList<Cards> playerOne = new ArrayList<Cards>(callDeck.dealPlayerOne());//create array list for player 1 acting as a deck
		ArrayList<Cards> playerTwo = new ArrayList<Cards>(callDeck.dealPlayerTwo());//create array list for player 2 acting as a deck
		
		//while loop to keep game going until winner
		while(playerOne.size() != 0 || playerTwo.size() != 0) {
			//creates each players top card
			Cards p1Card = playerOne.get(0);
            Cards p2Card = playerTwo.get(0);
            //outputs each players card
			System.out.println("player 1 plays " + p1Card);
			System.out.println("player 2 plays " + p2Card);
			//adds used cards to bottom of player 1's deck
			if (p1Card.getValue() > p2Card.getValue()) {
				System.out.println("Player 1 wins the round");
				playerOne.add(playerOne.get(0));
				playerOne.add(playerTwo.get(0));
				playerTwo.remove(0);
				playerOne.remove(0);
			}//end if
			//adds used cards to bottom of player 2's deck
			else if (p1Card.getValue() <  p2Card.getValue()) {
				System.out.println("Player 2 wins the round");
				playerTwo.add(playerOne.get(0));
				playerTwo.add(playerTwo.get(0));
				playerOne.remove(0);
				playerTwo.remove(0);
			}//end else if
			//scenario where there was a tie
			else{
				if (playerOne.size()>3 && playerTwo.size()>3) {
					//creates a war deck to add all the discarded cards
					System.out.println("War");
					ArrayList<Cards> warHolder = new ArrayList<Cards>();
					//adds 3 cards from both players to war deck and removes them from players
					for(int i=0; i<3; i++) {
						System.out.println("Player 1 plays xx\nPlayer 2 plays xx");
						warHolder.add(playerOne.get(0));
						warHolder.add(playerTwo.get(0));
						playerOne.remove(0);
						playerTwo.remove(0);
					}//end for
					
					//gets card from each player and prints it
					p1Card = playerOne.get(0);
		            p2Card = playerTwo.get(0);
					System.out.println("Player 1 plays " + p1Card);
					System.out.println("Player 2 plays " + p2Card);
					//determines if player 1 has a card with a higher value
					if (p1Card.getValue() > p2Card.getValue()) {
						System.out.println("Player 1 wins the war round");
						//adds the war array list to player 1's deck
						for(int i=0;i<3;i++) {
							playerOne.add(warHolder.get(0));
							warHolder.remove(0);
						}//end for
						
						//puts all cards used to the bottom of player 1's deck
						playerOne.add(playerTwo.get(0));
						playerOne.add(playerOne.get(0));
						playerTwo.remove(0);
						playerOne.remove(0);
					}//end if
					
					//determines if player 2 has a higher card value
					else if (p1Card.getValue() < p2Card.getValue()) {
						System.out.println("Player 2 wins the war round");
						//to add war deck to player 2's deck
						for(int i=0;i<3;i++) {
							playerTwo.add(warHolder.get(0));
							warHolder.remove(0);
						}//end for
						
						playerTwo.add(playerOne.get(0));
						playerTwo.add(playerTwo.get(0));
						playerOne.remove(0);
						playerTwo.remove(0);
					}//end else if
				}//end if
				
				//determines if both players can play war
				else {
					//prints that player 2 wins if player 1 has insufficient cards
					if (playerOne.size()<4) {
						System.out.println("Player 2 wins!");
						break;//break out of while loop
					}//end if
					
					//prints that player 1 wins if player 2 has insufficient cards
					else if (playerTwo.size()<4) {
						System.out.println("Player 1 wins!");
						break;//break out of while loop
					}//end else if
				}//end else
			}//end else
			
			//if player has insufficient cards break out of loop and print winner
			if (playerOne.size()==0) {
				System.out.println("Player 2 wins!");
				break;
			}//end if
			else if(playerTwo.size()==0) {
				System.out.println("Player 1 wins!");
				break;
			}//end else
			
			
		}//end while
	}//end main
}//end WarGame class
