public class q08_CountDigits {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Digit count: " + count);
    }
}
