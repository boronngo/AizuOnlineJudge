package ITP1.ITP1_4_D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println(min(numbers) + " " + max(numbers) + " " + sum(numbers));
		
		scanner.close();
	}
	
	private static int min(int[] numbers) {
		int min = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	private static int max(int[] numbers) {
		int max = numbers[0];
		
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	private static long sum(int[] numbers) {
		long sum = 0;
		
		for(int i: numbers) {
			sum += i;
		}
		return sum;
	}
}
