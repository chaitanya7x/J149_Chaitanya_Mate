public class q17_ImmutableStrings {
    public static void main(String[] args) {
        String s = "Hello";
        String s2 = s.concat(" World");
        System.out.println("Original: " + s);
        System.out.println("Modified: " + s2);
    }
}
