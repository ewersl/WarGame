package wargame;

public class Wargame {
	
	public static void main (String [] args) {
		Cards c1 = new Cards (); 
		System.out.println(c1);
		
		char suits = 'e'; 
		char ranks = 'x'; 
		Cards c2= new Cards(suits, ranks); 
		System.out.println(c2); 

	}
	
} 
