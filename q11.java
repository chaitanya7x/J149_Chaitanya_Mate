
// Check if a given number is a Prime number
import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No : ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("its prime no");
		}
		else {
			System.out.println("not prime");
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
