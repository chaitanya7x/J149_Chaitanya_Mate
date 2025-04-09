public class q13_FindEvenNumbers {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        for (int num : list) {
            if (num % 2 == 0)
                System.out.print(num + " ");
        }
    }
}
