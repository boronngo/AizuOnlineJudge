package AOJ0012;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();
			double x3 = scanner.nextDouble();
			double y3 = scanner.nextDouble();
			double xp = scanner.nextDouble();
			double yp = scanner.nextDouble();
			
			Triangle triangle = new Triangle(x1, x2, x3, y1, y2, y3);
			if (triangle.isInside(xp, yp)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		scanner.close();
	}
}

class Triangle {
	
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	
	Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	
	public boolean isInside(double x, double y) {
		double[] AB = {x1 - x2, y1 - y2};
		double[] BP = {x2 - x, y2 - y};
		double[] BC = {x2 - x3, y2 - y3};
		double[] CP = {x3 - x, y3 - y};
		double[] CA = {x3 - x1, y3 - y1};
		double[] AP = {x1 - x, y1 - y};
		
		double p1 = AB[0] * BP[1] - AB[1] * BP[0];
		double p2 = BC[0] * CP[1] - BC[1] * CP[0];
		double p3 = CA[0] * AP[1] - CA[1] * AP[0];
		
		if (p1 > 0 && p2 > 0 && p3 > 0) {
			return true;
		} else if (p1 < 0 && p2 < 0 && p3 < 0) {
			return true;
		} else {
			return false;
		}
	}
}


