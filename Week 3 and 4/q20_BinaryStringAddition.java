public class q20_BinaryStringAddition {
    public static void main(String[] args) {
        String a = "1010", b = "1111";
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        String result = Integer.toBinaryString(sum);
        System.out.println("Sum: " + result);
    }
}
