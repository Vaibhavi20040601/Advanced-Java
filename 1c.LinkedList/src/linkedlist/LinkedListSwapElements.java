package linkedlist;

import java.util.*;

public class LinkedListSwapElements {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        System.out.println("Before swapping: " + colors);
        Collections.swap(colors, 0, 2); // Swap first (index 0) and third (index 2)
        System.out.println("After swapping first and third elements: " + colors);
    }
}

