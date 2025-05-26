package arraylist;

import java.util.ArrayList;

public class ColorDeleteNth {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        int n = 2; // 3rd element, index = 2

        System.out.println("Original List: " + colors);

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting element at index " + n + ": " + colors);
        } else {
            System.out.println("Index " + n + " is out of bounds.");
        }
    }
}
