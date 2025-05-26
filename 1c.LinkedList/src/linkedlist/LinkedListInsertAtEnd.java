package linkedlist;

import java.util.*;

public class LinkedListInsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

        System.out.println("Before inserting: " + colors);
        colors.offerLast("Pink");
        System.out.println("After inserting 'Pink' at the end: " + colors);
    }
}

