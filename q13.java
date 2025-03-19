
//Print Fibonacci series till n
import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No.");
		int n = sc.nextInt();

		int first=0;int second=1;
		System.out.print(first+","+second);
		for (int i = 1; i < n; i++) {
			int temp=first+second;
			System.out.print(","+temp);
			first=second;
			second=temp;
		}
	}

}
