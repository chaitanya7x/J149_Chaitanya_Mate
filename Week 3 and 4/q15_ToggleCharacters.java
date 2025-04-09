public class q15_ToggleCharacters {
    public static void main(String[] args) {
        String input = "javaLanguage";
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(Character.toLowerCase(ch));
        }
        System.out.println("Toggled string: " + sb);
    }
}
