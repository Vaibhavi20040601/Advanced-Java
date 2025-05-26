package stringexercise2;

public class TruncateString {
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        } else {
            return str.substring(0, length) + "...";
        }
    }

    public static void main(String[] args) {
        String input = "Welcome to AIET College";
        System.out.println("Truncated: " + truncate(input, 10));
    }
}
