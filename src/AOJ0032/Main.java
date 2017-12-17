package AOJ0032;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rectangles = 0;
		int lozenges = 0;
		
		while(scanner.hasNext()) {
			String[] str = scanner.next().split(",");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			PlasticBoard plasticBoard = new PlasticBoard(a, b, c);
			
			if(plasticBoard.isRectangle()) {
				rectangles++;
			}
			if(plasticBoard.isLozenge()) {
				lozenges++;
			}
		}
		
		scanner.close();
		
		System.out.println(rectangles);
		System.out.println(lozenges);
		
	}
}

class PlasticBoard {
	
	private int a;
	private int b;
	private int c;
	
	public PlasticBoard(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isRectangle() {
		if(c * c == a * a + b * b) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean isLozenge() {
		if(a == b) {
			return true;
		} else {
			return false;
		}
	}
	
}
