public class q01_AdditionExamples {
    public static void main(String[] args) {
        int a = 5, b = 7;
        int sum = a + b;
        System.out.println("Sum of integers: " + sum);

        char ch1 = 'A', ch2 = 'B';
        int charSum = ch1 + ch2;
        System.out.println("Sum of characters: " + charSum);

        String binary1 = "1010";
        String binary2 = "1101";
        int binSum = Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2);
        System.out.println("Sum of binary numbers: " + Integer.toBinaryString(binSum));
    }
}
