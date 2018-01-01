package ITP1.ITP1_7.ITP1_7_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			
			if(n == 0 && x == 0) {
				break;
			}
			
			System.out.println(getWays(n, x));
		}
		
		scanner.close();
	}
	
	private static int getWays(int n, int x) {
		int count = 0;
		
		for(int a = 1; a <= n - 2; a++) {
			for(int b = a + 1; b <= n - 1; b++) {
				for(int c = b + 1; c <= n; c++) {
					if(a + b + c == x) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
