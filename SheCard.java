
public class SheCard {
	
	private int value;
	private String suit;
	private String name;
	
	public SheCard(int value, String suit) {
		this.value = value;
		this.suit = suit;
		}
	public void describe() {
		name = "";
		if(value == 2) {
			name += "Two ";
		}else if(value == 3) {
			name += "Three ";
		}else if(value == 4) {
			name += "Four ";
		}else if(value == 5) {
			name += "Five ";
		}else if(value == 6) {
			name += "Six ";
		}else if(value == 7) {
			name += "Seven ";
		}else if(value == 8) {
			name += "Eight ";
		}else if(value == 9) {
			name += "Nine ";
		}else if(value == 10) {
			name += "Ten ";
		}else if(value == 11) {
			name += "Jack ";
		}else if(value == 12) {
			name += "Queen ";
		}else if(value == 13) {
			name += "King ";
		}else if(value == 14) {
			name += "Ace ";
		}if(suit == "Heart") {
			name += "of Hearts";
		}else if(suit == "Diamond") {
			name += "of Diamonds";
		}else if(suit == "Club") {
			name += "of Clubs";
		}else if(suit == "Spade") {
			name += "of Spades";
		} 
		System.out.println(name);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	


}
