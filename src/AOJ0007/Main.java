package AOJ0007;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int week;
		
		Scanner scan = new Scanner(System.in);
		week = scan.nextInt();
		scan.close();
		System.out.println(calcDebt(week));
		
	}
	
	private static int calcDebt(int week) {
		int debt = 100000;
		final double loan = 1.05;
		
		while(week != 0) {
			debt *= loan;
			if(debt % 1000 != 0) {
				debt /= 1000;
				debt++;
				debt *= 1000;
			}
			week--;
		}
		
		return debt;
		
	}

}
