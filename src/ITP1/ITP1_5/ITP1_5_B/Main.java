package ITP1.ITP1_5.ITP1_5_B;

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
			
			printFrame(h, w);
			System.out.println();
		}
		
		scanner.close();
	}
	
	private static void printFrame(int h, int w) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(i == 0 || i == h - 1 || j == 0 || j == w - 1 ) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
