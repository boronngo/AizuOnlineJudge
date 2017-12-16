package AOJ0009;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean[] n;

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextInt()) {
			n = new boolean[scan.nextInt()];
			prime(n);
		}

		scan.close();
	}

	private static void prime(boolean n[]) {
		int count = 0;

		for (int c = 1; c < n.length; c++) {
			n[c] = true;
		}

		for (int c = 1; c < n.length; c++) {
			if (n[c]) {
				count++;
				
				for (int d = c; d < n.length; d+=c+1) {
					n[d] = false;
				}
				
			}
		}
		
		System.out.println(count);

	}
}