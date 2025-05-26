package linkedlist;

import java.util.*;

public class LinkedListReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println("LinkedList: " + colors);
        System.out.println("Iterating in reverse order:");

        Iterator<String> reverseIterator = colors.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println("  " + reverseIterator.next());
        }
    }
}

