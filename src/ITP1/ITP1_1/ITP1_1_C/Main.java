package ITP1.ITP1_1.ITP1_1_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int area = a * b;
		int perimeter = a * 2 + b * 2;
		
		System.out.println(area + " " + perimeter);
		
		scanner.close();
	}
}
