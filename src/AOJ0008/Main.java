package AOJ0008;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextInt()) {
			n = scan.nextInt();
			System.out.println(com(n));
		}
		scan.close();
	}

	private static int com(int n) {
		int count = 0;

		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
	
						if (a + b + c + d == n) {
							count++;
						}
						
					}
				}
			}
		}

		return count;
	}
}
