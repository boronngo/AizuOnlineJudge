package AOJ0027;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int month = scanner.nextInt();
			int day = scanner.nextInt();
			
			if (month == 0 && day == 0) {
				break;
			} else {
				System.out.println(getDayOfWeek(month, day));
			}
		}
		
		scanner.close();
		
	}
	
	private static String getDayOfWeek(int month, int day) {
		
		int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int totalDay = 0;
		for (int i = 0; i < month - 1; i++) {
			totalDay += days[i];
		}
		totalDay += day;
		
		switch (totalDay % 7) {
			case 0:
				return "Wednesday";
			case 1:
				return "Thursday";
			case 2:
				return "Friday";
			case 3:
				return "Saturday";
			case 4:
				return "Sunday";
			case 5:
				return "Monday";
			case 6:
				return "Tuesday";
			default:
				return null;
		}
		
	}
}
