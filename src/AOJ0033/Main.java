package AOJ0033;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int times = scanner.nextInt();
		
		for (int i = 0; i < times; i++) {
			int[] balls = new int[10];
			balls[0] = scanner.nextInt();
			balls[1] = scanner.nextInt();
			balls[2] = scanner.nextInt();
			balls[3] = scanner.nextInt();
			balls[4] = scanner.nextInt();
			balls[5] = scanner.nextInt();
			balls[6] = scanner.nextInt();
			balls[7] = scanner.nextInt();
			balls[8] = scanner.nextInt();
			balls[9] = scanner.nextInt();
			
			if(isSortable(balls)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}
		
		scanner.close();
		
	}
	
	private static boolean isSortable(int[] balls) {
		int b = 0;
		int c = 0;
		
		for (int ball: balls) {
			if (b < ball) {
				b = ball;
			} else if (c < ball) {
				c = ball;
			} else {
				return false;
			}
		}
		
		return true;
		
	}
}
