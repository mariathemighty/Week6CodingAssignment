import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SheDeck {
	
		
		List<SheCard> cards = new ArrayList<SheCard>();
	
	
	public SheDeck() {
		for(int i = 2; i <= 14; i++) {
			cards.add(new SheCard(i, "Heart"));
			cards.add(new SheCard(i, "Diamond"));
			cards.add(new SheCard(i, "Club"));
			cards.add(new SheCard(i, "Spade"));
		}
	}
	public void shuffle( ) {
		Collections.shuffle(cards);
	}
	
	public SheCard draw() {
		SheCard deckCard = cards.get(0);
		cards.remove(0);
		return deckCard;
		}
		
	

	
	public List<SheCard> getCards() {
		return cards;
	}
	public void setCards(List<SheCard> cards) {
		this.cards = cards;
	}
	public void describeDeck() {
		System.out.println("YOUR DECK:");
		for(SheCard deckCard : cards) {
			deckCard.describe();
		}
		System.out.println("END OF DECK /n");
	}
	
	

}
