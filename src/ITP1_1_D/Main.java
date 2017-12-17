package ITP1_1_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s = scanner.nextInt();
		int hour = s / 3600;
		int minute = (s - (hour * 3600)) / 60;
		int second = s - (hour * 3600) - (minute * 60);
		
		System.out.println(hour + ":" + minute + ":" + second);
		
		scanner.close();
	}
}
