public class q16_SquareRootManual {
    public static void main(String[] args) {
        int num = 16;
        int sqrt = 0;
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                sqrt = i;
                break;
            }
        }
        System.out.println("Square root of " + num + " is " + sqrt);
    }
}
