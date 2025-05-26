package stringexercise2;

public class WordCounter {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "AIET is a great college";
        System.out.println("Number of words: " + countWords(input));
    }
}

