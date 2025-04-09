public class q04_DisariumNumbers1to100 {
    public static void main(String[] args) {
        System.out.println("Disarium numbers between 1 and 100:");
        for (int num = 1; num <= 100; num++) {
            if (isDisarium(num)) System.out.print(num + " ");
        }
    }

    static boolean isDisarium(int num) {
        int count = Integer.toString(num).length();
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count--);
            temp /= 10;
        }
        return sum == num;
    }
}
