import java.util.Scanner;

public class q14_CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = sc.nextInt();
        System.out.print("Enter digit D: ");
        int d = sc.nextInt();
        int count = 0, temp = n;
        while (temp != 0) {
            if (temp % 10 == d) count++;
            temp /= 10;
        }
        System.out.println("Digit " + d + " occurs " + count + " times in " + n);
    }
}
