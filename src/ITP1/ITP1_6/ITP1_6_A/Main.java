package ITP1.ITP1_6.ITP1_6_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		
		for(int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(numbers[i]);
			if(i != 0) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
		
		scanner.close();
		
	}
}
