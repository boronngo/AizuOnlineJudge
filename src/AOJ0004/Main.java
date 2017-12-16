package AOJ0004;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] input = new double[6];
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			for (int i = 0; i < input.length; i++) {
				input[i] = scan.nextDouble();
			}
			double adbc = input[0] * input[4] - input[1] * input[3]; 
			double tempX = input[2] * input[4] - input[5] * input[1];
			double tempY = input[0] * input[5] - input[3] * input[2];
			
			double ansX = tempX / adbc;
			double ansY = tempY / adbc;
			
			System.out.println(ansX);
			System.out.println(ansY);
			
			DecimalFormat df = new DecimalFormat("#0.000");
			df.setRoundingMode(RoundingMode.HALF_UP);
			
			System.out.println(df.format(new BigDecimal(ansX)));
			
			System.out.println(String.format("%.3f %.3f", ansX, ansY));
		}
		
		scan.close();
	}
}
