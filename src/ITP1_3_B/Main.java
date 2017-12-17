package ITP1_3_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			int i = scanner.nextInt();
			
			if(i == 0) {
				break;
			}
			
			count++;
			System.out.println("Case " + count + ": " + i);
			
		}
		
		scanner.close();
	}
}
