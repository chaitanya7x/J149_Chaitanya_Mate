//8	Display prime numbers between 1 and 100 or 1 and n

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int range = sc.nextInt();

		System.out.println("2,3");

		for (int i = 2; i <= range; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
