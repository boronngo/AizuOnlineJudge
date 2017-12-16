package AOJ0005;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		long a;
		long b;
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLong()) {
			a = scan.nextLong();
			b = scan.nextLong();
			
			System.out.println(GCD(a, b) + " " + LCM(a, b));
		}
		
		scan.close();
		
	}
	
	private static long GCD(long a, long b) {
		long c;
		c = a % b;
		
		if(c == 0) {
			return b;
		}else {
			return GCD(b, c);
		}
		
	}
	
	private static long LCM(long a, long b) {
		return a * b / GCD(a, b);
	}

}
