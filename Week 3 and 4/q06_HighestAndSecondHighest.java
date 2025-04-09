public class q06_HighestAndSecondHighest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Highest: " + first + ", Second Highest: " + second);
    }
}
