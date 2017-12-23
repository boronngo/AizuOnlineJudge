package ITP1.ITP1_4.ITP1_4_B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		double area = r * r * Math.PI;
		double circum = 2 * r * Math.PI;
		
		System.out.printf("%.5f %.5f", area, circum);
		
		scanner.close();
	}
}
