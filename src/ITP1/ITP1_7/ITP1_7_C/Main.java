package ITP1.ITP1_7.ITP1_7_C;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		
		SpreadSheet spreadSheet = new SpreadSheet(r, c);
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				spreadSheet.setValue(i, j, scanner.nextInt());
			}
		}
		
		spreadSheet.output();
		scanner.close();
		
	}

}

class SpreadSheet {
	
	private int[][] values;
	
	public SpreadSheet(int row, int column) {
		values = new int[row][column];
	}
	
	public void setValue(int row, int column, int value) {
		values[row][column] = value;
	}
	
	private int getSumColumn(int column) {
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += values[i][column];
		}
		
		return sum;
	}
	
	private int getSumRow(int row) {
		int sum = 0;
		
		for(int i = 0; i < values[row].length; i++) {
			sum += values[row][i];
		}
		
		return sum;
	}
	
	private int getSum() {
		int sum = 0;
		
		for(int i = 0; i < values.length; i++) {
			sum += getSumRow(i);
		}
		
		return sum;
	}
	
	public void output() {
		for(int i = 0; i < values.length; i++) {
			for(int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j] + " ");
			}
			System.out.print(getSumRow(i));
			System.out.println();
		}
		
		for(int i = 0; i < values[0].length; i++) {
			System.out.print(getSumColumn(i) + " ");
		}
		
		System.out.println(getSum());
	}
}