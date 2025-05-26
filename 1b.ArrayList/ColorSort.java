package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        System.out.println("Original List: " + colors);

        Collections.sort(colors);

        System.out.println("Sorted List: " + colors);
    }
}

