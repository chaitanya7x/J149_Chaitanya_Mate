// Calculate grades of students using their marks

import java.util.Scanner;

public class q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks till 100: ");
		int marks = sc.nextInt();
		System.out.println("Grade: " + calculateGrade(marks));
	}

	public static char calculateGrade(int marks) {
		if (marks >= 90)
			return 'A';
		else if (marks >= 80)
			return 'B';
		else if (marks >= 70)
			return 'C';
		else if (marks >= 60)
			return 'D';
		else
			return 'F';
	}
}
