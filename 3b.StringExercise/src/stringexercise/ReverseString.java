package stringexercise;

public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "AIET";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
