// Check Armstrong number

import java.util.Scanner;

public class q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println("Armstrong: " + ArmstrongChecker.isArmstrong(num));
	}

}

class ArmstrongChecker {
	public static boolean isArmstrong(int num) {
		int originalNum = num, remainder, result = 0;
		int n = String.valueOf(num).length();
		while (num != 0) {
			remainder = num % 10;
			result += Math.pow(remainder, n);
			num /= 10;
		}
		return result == originalNum;
	}
}