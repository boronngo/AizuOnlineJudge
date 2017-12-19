package ITP1.ITP1_4_C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		loop: while(scanner.hasNext()) {
			int a = scanner.nextInt();
			char op = scanner.next().charAt(0);
			int b = scanner.nextInt();
			
			switch (op) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			case '?':
				break loop;
			}			
		}
		scanner.close();
	}
}
