package arraylist;

import java.util.ArrayList;

public class ColorRemove {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue" by value
        colors.remove("Blue");

        System.out.println("Updated List: " + colors);
    }
}

