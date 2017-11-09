package wargame;

public class Cards {
	// attributes 
	private char suits;
	private char ranks; 
	
	private static char [] SUITS = {'S', 'D', 'H', 'C'};
	private static char [] RANKS = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
	
	//methods 
	// ---- overload the constructor
	// random card 
	
	public Cards () {
		int num = (int) (Math.random() * SUITS.length); 
		suits = SUITS[num];
		
		num = (int)(Math.random() * RANKS.length); 
		ranks = RANKS [num];
		
	}
	
	//constructor 
	public Cards (char s, char r) {
		setSuits = s;
		setRank(r); 
	}
	// set rank within out requirements 
	public void setRank(char r) {
		//check to see if it's in RANKS
		for (int i = 0; i < RANKS.length; i++) {
			if (r == RANKS [i]) {
				ranks = r; 
				return; 
			}
		}
		System.out.println (" Rank not found in list.");
	}
	
	public void setSuits (char s) {
		for (int i = 0; i < SUITS.length; i++); 
	}
	//set suit within out requirements 
	
	//toString method 
	public String toString () {
		String cardInfo = "Rank: " + ranks + " Suit: " + suits; 
		return cardInfo; 
	}

}
