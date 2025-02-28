//2	Calculate compound interest

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

        System.out.print("Enter the principal : ");
        double p = sc.nextDouble();

        System.out.print("Enter the interest rate : ");
        double r = sc.nextDouble() / 100; 

        System.out.print("Enter the number of times the interest is compounded per year : ");
        int compPerYear = sc.nextInt();

        System.out.print("Enter the number of Years : ");
        int n = sc.nextInt();

        double amount = p * Math.pow(1 + r / compPerYear, compPerYear * n);

        double compoundInterest = amount - p;

        System.out.println("The compound interest is :" + compoundInterest);
        System.out.println("The total amount after "+ n + " Years : " + amount);
	}

}
