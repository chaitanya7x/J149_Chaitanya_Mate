public class q19_MixedFeaturesDemo {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Factorial of 5: " + factorial(5));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
