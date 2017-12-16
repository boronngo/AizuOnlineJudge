package AOJ0011;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int lines = scan.nextInt();
		int n = scan.nextInt();

		Lots lots = new Lots(lines);

		for (int c = 0; c < n; c++) {
			String[] input = scan.next().split(",");
			lots.connect(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}

		for (int c = 1; c <= lines; c++) {
			System.out.println(lots.getLine(c));
		}
		scan.close();
	}

}

class Lots {
	private int[] line;

	Lots(int lines) {
		line = new int[lines];

		for (int c = 0; c < line.length; c++) {
			line[c] = c + 1;
		}
	}

	public void connect(int a, int b) {
		int temp = line[a - 1];
		line[a - 1] = line[b - 1];
		line[b - 1] = temp;
	}

	public int getLine(int n) {
		return line[n - 1];
	}
}
