package ITP1_3_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int count = 0;
		
		for(int i = a; i <= b; i++) {
			if(c % i == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		scanner.close();
	}
}
