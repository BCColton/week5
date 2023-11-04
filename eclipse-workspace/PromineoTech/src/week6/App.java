package week6;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Deck theDeck = new Deck();
		Player PlayerOne = new Player("PlayerOne");
		Player PlayerTwo = new Player("PlayerTwo");
		

		theDeck.shuffle();
		theDeck.shuffle();		
		
		
		while (!theDeck.cards.isEmpty()) {
			PlayerOne.draw(theDeck);
			PlayerTwo.draw(theDeck);
		}
		
		int round = 0;
		while (!PlayerOne.hand.isEmpty() && !PlayerTwo.hand.isEmpty()) {
			System.out.println("Round: " + ++round);
			System.out.print("Player One plays the ");
			PlayerOne.hand.get(0).describe();
			System.out.print("Player Two plays the ");
			PlayerTwo.hand.get(0).describe();
			int difference = PlayerOne.flip().getValue() - PlayerTwo.flip().getValue();
			
			if (difference > 0) { 
				//PlayerOne has high card
				PlayerOne.incrementScore();
				System.out.println("Player One has scored a point.");
			} else if (difference < 0) {
				//PlayerTwo has high card
				PlayerTwo.incrementScore();
				System.out.println("Player Two has scored a point.");
			} else {
				System.out.println("Tie! No points awarded.");
			}
		}
		
		if (PlayerOne.score > PlayerTwo.score) {
			System.out.println("Player One wins with a score of: " + PlayerOne.score + " points");
		} else if (PlayerOne.score < PlayerTwo.score) {
			System.out.println("Player Two wins with a score of: " + PlayerTwo.score + " points");
		} else {
			System.out.println("Draw!");
		}
		
	}
	
}

//Helper Class are below this comment
class Card {
	
	
	private int value; //NOTE: Aces are high in this implementation so values go from 2 - 14
	private int suit; //0 - Clubs; 1 - Diamonds; 2 - Hearts; 3 - Spades 
	private String name; // this.value of this.suit
	
	//
	public Card(int v, int s) {
		setValue(v);
		setSuit(s);
		setName(decideName());
	}
	
	public int getValue() {
		return this.value;
	}
	
	private void setValue(int value) {
		this.value = value;
	}
	
	public int getSuit() {
		return suit;
	}
	
	private void setSuit(int suit) {
		this.suit = suit;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(this.name);
	}
	
	private String decideName() {
		String result = "";
		
		if (this.value < 11) {
			result += this.value;
		} else {
			switch(this.value) { 
			
				case 11: result += "Jack";
				break;
				
				case 12: result += "Queen";
				break;
				
				case 13: result += "King";
				break;
				
				case 14: result += "Ace";
				break;
				
				default:
				break;
				
			}
		}
		
		result += " of ";
		
		//0 - Clubs; 1 - Diamonds; 2 - Hearts; 3 - Spades 
		switch(this.suit) {
		
			case 0: result += "Clubs";
			break;
			
			case 1: result += "Diamonds";
			break;
			
			case 2: result += "Hearts";
			break;
			
			case 3: result += "Spades";
			break;
			
			default:
			break;
		
		}
		
		return result;
	}
	
	
}

class Deck {

	List<Card> cards = new ArrayList<>();
	
	//52 cards initialized in constructor
	public Deck() {
		for (int i = 2; i <= 14; i++) {
			for (int j = 0; j <=3; j++) {
				cards.add(new Card(i,j));
			}
		}
	}
	
	//Implementation of a Fisher-Yates shuffle algorithm
	public void shuffle() {
		Random rand = new Random();
		for(int i = this.cards.size() - 1; i > 0; i--) {
			int j = rand.nextInt(0, i);
			Card temp = cards.get(i);
			cards.set(i, cards.get(j));
			cards.set(j, temp);
		}
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
}

class Player {
	
	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	public Player (String name) {
		this.name = name;
		score = 0;
	}
	
	public void describe() {
		System.out.println(this.name + " has " + this.score + " point(s).");
		System.out.println(this.name + "'s hand is:");
		for(Card c: this.hand) { 
			c.describe();
		}
	}
	
	public Card flip() {
		return this.hand.remove(0);
	}
	
	public void draw(Deck d) {
		this.hand.add(d.draw());
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	
	
	
}
