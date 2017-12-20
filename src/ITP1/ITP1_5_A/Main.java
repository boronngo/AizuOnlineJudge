package ITP1.ITP1_5_A;

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
			
			printRectangle(h, w);
			System.out.println();
		}

		scanner.close();
	}
	
	private static void printRectangle(int h, int w) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
