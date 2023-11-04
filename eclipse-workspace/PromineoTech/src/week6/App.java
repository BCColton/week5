package week6;

public class App {

	public static void main(String[] args) {
		
	}

}

class Card {
	
	
	int value; //NOTE: Aces are high in this implementation so values go from 2 - 14
	int suit; //0 - Clubs; 1 - Diamonds; 2 - Hearts; 3 - Spades 
	String name; // this.value of this.suit
	
	//
	public Card(int v, int s) {
		this.value = v;
		this.suit = s;
		setName(decideName());
	}
	
	public int getValue() {
		return value;
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
		System.out.print(this.name);
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

class Hand {
	
}
