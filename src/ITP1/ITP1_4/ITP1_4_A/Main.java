package ITP1.ITP1_4.ITP1_4_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int d = a / b;
		int r = a % b;
		double f = (double)a / b;
		
		System.out.printf("%d %d %.5f", d, r, f);
		
		scanner.close();
	}
}
