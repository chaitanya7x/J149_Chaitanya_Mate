//10	Find the factorial of a number
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
        	fact *= i;        	
        }
        System.out.println("Factorial: " + fact);
	}
	}

