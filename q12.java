
// Check if a number is palindrome or not
import java.util.Scanner;

public class q12 {
	static int rev=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. :");
		int num = sc.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome no");
		}
		
	}
	
	public static boolean isPalindrome(int num) {
		int temp=Math.abs(num);
		
		while(temp!=0) {
			rev = (rev * 10) + (temp % 10);
			temp=temp/10;
		}
		System.out.println(rev);
		return rev==Math.abs(num);
		
	}

}
