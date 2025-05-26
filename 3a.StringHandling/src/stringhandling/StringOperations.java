package stringhandling;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3: " + str1.equals(str3)); // case-sensitive
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3)); // ignore case

        // 4. String Searching
        String sentence = "Welcome to Java Programming";
        System.out.println("Original sentence: " + sentence);
        System.out.println("Index of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Contains 'Program': " + sentence.contains("Program"));

        // 5. Substring Operations
        String sub = sentence.substring(11, 15); // "Java"
        System.out.println("Substring from index 11 to 15: " + sub);

        // 6. String Modification
        String replaced = sentence.replace("Java", "Python");
        System.out.println("Replaced sentence: " + replaced);

        // 7. Whitespace Handling
        String withSpaces = "   Trim this string   ";
        System.out.println("Original: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String full = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + full);

        // 9. String Splitting
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println(" - " + fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" -> Middle");
        sb.append(" -> End");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Email Validation
        String email = "student@aiet.edu.in";
        System.out.println("Email: " + email);
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".edu.in");
        System.out.println("Contains '@': " + email.contains("@"));
        System.out.println("Starts with 'student': " + email.startsWith("student"));
        System.out.println("Ends with '.edu.in': " + email.endsWith(".edu.in"));
        System.out.println("Is email valid? " + (isValid ? "Yes" : "No"));
    }
}
