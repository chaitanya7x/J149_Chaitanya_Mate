import java.util.Arrays;

public class q02_SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
