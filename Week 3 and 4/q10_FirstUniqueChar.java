public class q10_FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.println("First unique character: " + s.charAt(i));
                return;
            }
        }
        System.out.println("No unique character found.");
    }
}
