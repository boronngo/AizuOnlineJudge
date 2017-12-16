package AOJ0028;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		modeValue mv = new modeValue();
		Scanner scan = new Scanner(System.in);

		while (scan.hasNextInt()) {
			mv.inputValue(scan.nextInt());
		}
		
		mv.outputModeValue();
		scan.close();
		
	}

}

class modeValue {
	int[] value = new int[100];
	int max = 0;

	public void inputValue(int n) {
		value[n]++;
		if(value[n] > max) {
			max = value[n];
		}
	}

	public void outputModeValue() {
		for(int c = 1; c < value.length; c++) {
			if(value[c] == max) {
				System.out.println(c);
			}
		}
	}

}
