package ITP1.ITP1_2.ITP1_2_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a < b) {
			System.out.println("a < b");
		} else if (b < a) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
		
		scanner.close();
	}
}
