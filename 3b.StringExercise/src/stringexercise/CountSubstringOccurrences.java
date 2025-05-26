package stringexercise;

public class CountSubstringOccurrences {
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String mainString = "AIET is great. AIET teaches well. AIET is awesome!";
        String subString = "AIET";

        int result = countOccurrences(mainString, subString);
        System.out.println("Occurrences of '" + subString + "': " + result);
    }
}

