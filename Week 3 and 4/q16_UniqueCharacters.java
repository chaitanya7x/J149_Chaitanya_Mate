public class q16_UniqueCharacters {
    public static void main(String[] args) {
        String s = "programming";
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c))
                System.out.print(c + " ");
        }
    }
}
