// Use switch case, recursion, print patterns, etc.

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Pyramid\n2. Inverted Triangle");
        int choice = sc.nextInt();
        int rows = sc.nextInt();
        
        switch (choice) {
            case 1:
                pyramid(rows, 1);
                break;
            case 2:
                inverted(rows, rows);
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();
    }

    public static void pyramid(int n, int row) {
        if (row > n) return;
        spaces(n - row);
        stars(2 * row - 1);
        System.out.println();
        pyramid(n, row + 1);
    }

    public static void inverted(int n, int row) {
        if (row == 0) return;
        stars(2 * row - 1);
        System.out.println();
        inverted(n, row - 1);
    }

    public static void spaces(int c) {
        if (c == 0) return;
        System.out.print(" ");
        spaces(c - 1);
    }

    public static void stars(int c) {
        if (c == 0) return;
        System.out.print("*");
        stars(c - 1);
    }
}
