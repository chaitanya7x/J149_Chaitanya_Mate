import java.util.Arrays;

public class q11_ValidAnagram {
    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        char[] a1 = s1.toCharArray(), a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean result = Arrays.equals(a1, a2);
        System.out.println("Are they anagrams? " + result);
    }
}
