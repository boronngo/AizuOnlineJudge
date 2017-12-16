package AOJ0014;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		Integral integral = new Integral();
		
		while(scan.hasNextInt()) {
			input = scan.nextInt();
			System.out.println(integral.areaSquare(input));
		}
		
		scan.close();
	}

}

class Integral {
	private final int x = 600;

	public int areaSquare(int d) {
		int n = x / d;
		int s = 0;

		for (int c = 0; c < n; c++) {
			s += x2(d * c) * d;
		}

		return s;

	}

	private int x2(int x) {
		return (int) Math.pow(x, 2);
	}

}
