package AOJ0010;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double x1, x2, x3;
		double y1, y2, y3;

		for (; n > 0; n--) {
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			
			Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
			
			DecimalFormat df = new DecimalFormat("#0.000");
			df.setRoundingMode(RoundingMode.HALF_UP);
			
			System.out.println(df.format(tri.getCircumcenterX()) + " "
										+ df.format(tri.getCircumcenterY()) + " "
										+ df.format(tri.getCircumcenterRadius()));
			}
		scan.close();
	}
	
}	
	
class Triangle {
		private double X1, X2, X3;
		private double Y1, Y2, Y3;
		private double a, b, c, a2, b2, c2;
		private double S, S2, s;
		private double r, xp , yp;
		
		Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
			X1 = x1;	X2 = x2;	X3 = x3;
			Y1 = y1;	Y2 = y2;	Y3 = y3;
			
			a2 = pow(X3 - X2, 2) + pow(Y3 - Y2, 2);
			b2 = pow(X3 - X1, 2) + pow(Y3 - Y1, 2);
			c2 = pow(X2 - X1, 2) + pow(Y2 - Y1, 2);
			
			a = sqrt(a2);
			b = sqrt(b2);
			c = sqrt(c2);
			
			s = (a + b + c) / 2;
			S2 = s * (s - a) * (s - b) * (s - c);
			S = sqrt(S2);

		}
		
		public double getCircumcenterX() {
			xp = (a2 * (b2 + c2 - a2) * X1 + b2 * (c2 + a2 - b2) * X2 + c2* (a2 + b2 - c2) * X3)
					/ 16 / S2;
			return xp;
		}
		
		public double getCircumcenterY() {
			yp = (a2 * (b2 + c2 - a2) * Y1 + b2 * (c2 + a2 - b2) * Y2 + c2* (a2 + b2 - c2) * Y3)
					/ 16 / S2;
			return yp;
		}
		
		public double getCircumcenterRadius() {
			r = a * b * c / 4 / S;
			return r;
		}
		
}
