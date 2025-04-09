public class q09_RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "aabbccdde";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            int len = result.length();
            if (len > 0 && result.charAt(len - 1) == ch)
                result.deleteCharAt(len - 1);
            else
                result.append(ch);
        }
        System.out.println("Output: " + result);
    }
}
