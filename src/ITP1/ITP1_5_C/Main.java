package ITP1.ITP1_5_C;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			
			if(h == 0 && w == 0) {
				break;
			}
			
			printChessBoard(h, w);
			System.out.println();
		}
		scanner.close();
	}
	
	private static void printChessBoard(int h, int w) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if((i + j) % 2 == 0) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
