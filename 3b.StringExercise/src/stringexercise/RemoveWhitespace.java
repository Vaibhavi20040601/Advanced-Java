package stringexercise;

public class RemoveWhitespace {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String original = "  A I E T   College   ";
        String noWhitespace = removeWhitespace(original);
        System.out.println("Original: '" + original + "'");
        System.out.println("Without whitespace: '" + noWhitespace + "'");
    }
}
