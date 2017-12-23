package ITP1.ITP1_2.ITP1_2_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		
		if((x - r >= 0) && (y - r >= 0) && (x + r <= w) && (y + r <= h)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scanner.close();
	}
}
