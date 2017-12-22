package ITP1.ITP1_6_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		
		CardManager cardManager = new CardManager();
		
		while(scanner.hasNext()) {
			cardManager.addCard(scanner.next(), scanner.nextInt());
		}
		
		cardManager.outputMissingCards();
		
		scanner.close();
		
	}
}

class CardManager {
	private boolean[] spades = new boolean[13];
	private boolean[] hearts = new boolean[13];
	private boolean[] clubs = new boolean[13];
	private boolean[] diamonds = new boolean[13];
	
	public void addCard(String mark, int n) {
		switch (mark) {
		case "S":
			spades[n-1] = true;
			break;
		case "H":
			hearts[n-1] = true;
			break;
		case "C":
			clubs[n-1] = true;
			break;
		case "D":
			diamonds[n-1] = true;
			break;
		}
	}
	
	public void outputMissingCards() {
		for(int i = 0; i < spades.length; i++) {
			if(!spades[i]) {
				System.out.println("S " + (i+1));
			}
		}
		for(int i = 0; i < hearts.length; i++) {
			if(!hearts[i]) {
				System.out.println("H " + (i+1));
			}
		}
		for(int i = 0; i < clubs.length; i++) {
			if(!clubs[i]) {
				System.out.println("C " + (i+1));
			}
		}
		for(int i = 0; i < diamonds.length; i++) {
			if(!diamonds[i]) {
				System.out.println("D " + (i+1));
			}
		}
	}
}
