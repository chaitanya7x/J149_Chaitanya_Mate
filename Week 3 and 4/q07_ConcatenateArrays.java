import java.util.Arrays;

public class q07_ConcatenateArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        System.out.println(Arrays.toString(result));
    }
}
