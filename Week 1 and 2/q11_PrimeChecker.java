public class q11_PrimeChecker {
    public static void main(String[] args) {
        int n = 29, i;
        boolean isPrime = true;

        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + (isPrime ? " is Prime" : " is not Prime"));
    }
}
