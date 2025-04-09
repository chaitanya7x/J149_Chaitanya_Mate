public class q12_ReplaceDigitsWithChars {
    public static void main(String[] args) {
        String input = "a1c1e1";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                char prev = sb.charAt(sb.length() - 1);
                sb.append((char)(prev + (ch - '0')));
            } else {
                sb.append(ch);
            }
        }
        System.out.println("Converted: " + sb);
    }
}
