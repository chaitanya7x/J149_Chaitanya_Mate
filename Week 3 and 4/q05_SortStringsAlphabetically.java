import java.util.Arrays;

public class q05_SortStringsAlphabetically {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry"};
        Arrays.sort(words);
        for (String word : words)
            System.out.println(word);
    }
}
