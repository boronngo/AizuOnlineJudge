package ITP1.ITP1_7.ITP1_7_A;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			int m = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			
			if(m == -1 && f == -1 && r == -1) {
				break;
			}
			
			System.out.println(getGrade(m, f, r));
		}
		
		scanner.close();
	}
	
	private static char getGrade(int m, int f, int r) {
		if(m == -1 || f == -1) {
			return 'F';
		} else if(m + f >= 80) {
			return 'A';
		} else if(m + f >= 65) {
			return 'B';
		} else if(m + f >= 50) {
			return 'C';
		} else if(m + f >= 30) {
			if(r >= 50) {
				return 'C';
			} else {
				return 'D';
			}
		} else {
			return 'F';
		}
	}

}
