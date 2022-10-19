
public class SheApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	ShePlayer player1 = new ShePlayer("Spanky");
	ShePlayer player2 = new ShePlayer("Darla");
	
	SheDeck appDeck = new SheDeck();
	appDeck.shuffle();
//	System.out.println("*********DECK*********");
//	appDeck.describeDeck();
//	System.out.println("*********END OF DECK*********");
//	appDeck.draw();
//	System.out.println("*********DECK less 1*********");
//	appDeck.describeDeck();
//	System.out.println("*********END OF DECK less 1*********");
	
	System.out.println("Cards were drawn in the following order:\n");
	
	for(int i = 0; i < 52; i++) {
		if(i % 2 == 0) {
			player1.draw(appDeck);
		} else {
			player2.draw(appDeck);
		}
	}
	System.out.println("\n");
	
	player1.playDescribe();
	player2.playDescribe();

	
	for(int i = 1; i <= 25; i++) { 
		
		System.out.println("The cards for round " + i + " are:");
		player1.flip();
		player2.flip();
		SheCard play1 = new SheCard(player1.battleValue(), player1.battleSuit());
		SheCard play2 = new SheCard(player2.battleValue(), player2.battleSuit());
	
		if (play1.getValue() > play2.getValue()) {
			System.out.println(player1.getPlayName() + " has won this battle!\n");
			player1.incrementScore();
		}else if (play1.getValue() < play2.getValue()) {
			System.out.println(player2.getPlayName() + " has won this battle!\n");
			player2.incrementScore();
		}else {
			System.out.println("This battle has ended in a draw!\n");
			
		}
	}
	System.out.println("RESULTS:\n");
	player1.playDescribe();
	player2.playDescribe();
	
	if(player1.getScore() > player2.getScore()) {
		System.out.println("***** " + player1.getPlayName() + " HAS WON THE WAR! *****");
	}else
		System.out.println("***** " + player2.getPlayName() + " HAS WON THE WAR! *****");
	}
	
	}


			
		
			
	
	
	
	
	
	



