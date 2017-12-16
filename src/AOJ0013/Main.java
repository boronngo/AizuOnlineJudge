package AOJ0013;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Railroad railroad = new Railroad();

		while (scan.hasNextInt()) {
			railroad.input(scan.nextInt());
		}

		scan.close();
	}

}

class Railroad {
	ArrayList<Integer> cars = new ArrayList<Integer>();

	public void input(int n) {

		if (n == 0) {
			removeCar();
		} else {
			addCar(n);
		}

	}

	private void addCar(int n) {
		cars.add(n);
	}

	private void removeCar() {
		int last = cars.size() -1 ;
		System.out.println(cars.get(last));
		cars.remove(last);
	}
}
