package stringhanding;

public class StringOperationsDemo {
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
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String sentence = "Welcome to Java programming";
        System.out.println("Original sentence: " + sentence);
        System.out.println("Index of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Contains 'program': " + sentence.contains("program"));

        // 5. Substring Operations
        String sub = sentence.substring(11, 15); // "Java"
        System.out.println("Substring from index 11 to 15: " + sub);

        // 6. String Modification
        String replaced = sentence.replace("Java", "Python");
        System.out.println("Replaced sentence: " + replaced);

        // 7. Whitespace Handling
        String dirty = "   Hello Java   ";
        System.out.println("Original with spaces: '" + dirty + "'");
        System.out.println("Trimmed: '" + dirty.trim() + "'");

        // 8. String Concatenation
        String full = str1 + " " + str2;
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
        sb.append(" - Middle");
        sb.append(" - End");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 30;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "test@example.com";
        System.out.println("Email: " + email);
        boolean valid = email.contains("@") && email.endsWith(".com") && email.indexOf("@") > 0;
        System.out.println("Contains '@': " + email.contains("@"));
        System.out.println("Starts with 'test': " + email.startsWith("test"));
        System.out.println("Ends with '.com': " + email.endsWith(".com"));
        System.out.println("Is email valid? " + (valid ? "Yes" : "No"));
    }
}
