import java.util.ArrayList;
import java.util.List;

public class ShePlayer {
	
	List<SheCard> hand;
	int score;
	String playName;
	
	public ShePlayer(String playName) {
		this.playName = playName;
		score = 0;
		hand = new ArrayList<SheCard>();
	}
	public SheCard flip() {
		SheCard flipped = hand.get(0);
		flipped.describe();
		hand.remove(0);
		return flipped;
	}
	public int battleValue() {
		SheCard flipped = hand.get(0);
		int battleValue = flipped.getValue();
		return battleValue;
	}
	public String battleSuit() {
		SheCard flipped = hand.get(0);
		String battleSuit = flipped.getSuit();
		return battleSuit;
	}
	
	public void draw(SheDeck cards) {
		SheCard drawn = cards.draw();
		drawn.describe();
		hand.add(drawn);
		}
	
	public void incrementScore() {
		this.score++;
	}
	public void playDescribe() {
		System.out.println("PLAYER: " + playName + " SCORE: " + score + "\nCARDS IN HAND:");
		for(SheCard x : hand) {
			x.describe();
		}
		System.out.println("\n");
	}
	public List<SheCard> getHand() {
		return hand;
	}
	public void setHand(List<SheCard> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	
	
}
