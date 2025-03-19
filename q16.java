// Find square root of a number without sqrt method

import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Square Root: " + SquareRootCalculator.sqrt(num));
	}

}

class SquareRootCalculator {
	public static double sqrt(int num) {
		double t;
		double sqrtRoot = num / 2;
		do {
			t = sqrtRoot;
			sqrtRoot = (t + (num / t)) / 2;
		} while ((t - sqrtRoot) != 0);
		return sqrtRoot;
	}
}
