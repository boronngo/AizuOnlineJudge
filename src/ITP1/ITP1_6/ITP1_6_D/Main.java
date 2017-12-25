package ITP1.ITP1_6.ITP1_6_D;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[][] a = new int[n][m];
		int[] b = new int[m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
		}
		
		int[] result = multiple(a, b);
		for(int num: result) {
			System.out.println(num);
		}
		
		scanner.close();
	}
	
	private static int[] multiple(int[][] a, int[] b) {
		int[] result = new int[a.length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				result[i] += a[i][j] * b[j];
			}
		}
		
		return result;
	}

}
