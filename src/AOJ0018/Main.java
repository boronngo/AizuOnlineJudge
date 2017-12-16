package AOJ0018;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] n = new int[5];
		Scanner scan = new Scanner(System.in);

		for (int c = 0; c < 5; c++) {
			n[c] = scan.nextInt();
		}

		Arrays.sort(n);

		for (int c = 4; c > 0; c--) {
			System.out.print(n[c]+" ");
		}
		System.out.println(n[0]);

		scan.close();

	}
}
