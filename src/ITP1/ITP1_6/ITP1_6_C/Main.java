package ITP1.ITP1_6.ITP1_6_C;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		OfficialHouseManager manager = new OfficialHouseManager();
		
		for(int i = 0; i < n; i++) {
			int b = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();
			manager.addTenants(b, f, r, v);
		}
		
		manager.output();
		scanner.close();
		
	}
	
}

class OfficialHouseManager {
	int[][][] tenants = new int[4][3][10];
	
	public void addTenants(int b, int f, int r, int v) {
		tenants[b-1][f-1][r-1] += v;
	}
	
	public void output() {
		Iterator<int[][]> building = Arrays.asList(tenants).iterator();
		while(building.hasNext()) {
			for(int[] floor: building.next()) {
				for(int num: floor) {
					System.out.print(" ");
					System.out.print(num);
				}
				System.out.println();
			}
			
			if(building.hasNext()) {
				System.out.println("####################");
			}
		}
	}
}
