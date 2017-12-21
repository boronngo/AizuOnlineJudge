package ITP1.ITP1_5_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		call(scanner.nextInt());
		scanner.close();
	}

	private static void call(int n) {
		for(int i = 1; i <= n; i++) {
			int x = i;
			if(x % 3 == 0) {
				System.out.print(" ");
				System.out.print(i);
				continue;
			}
			do {
				if(x % 10 == 3) {
					System.out.print(" ");
					System.out.print(i);
					break;
				}
				x /= 10;
			} while(x != 0);
		}
		System.out.println();
	}
}
