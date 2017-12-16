package AOJ0006;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String text;
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			text =  scan.next();
			System.out.println(reverse(text));
		}
		
		scan.close();
		
	}
	
	private static String reverse(String text) {
		String revStr = "";
		
		for(int c = 0; c < text.length(); c++) {
			revStr += text.charAt(text.length() - c - 1);
		}
		
		return revStr;
	}

}
