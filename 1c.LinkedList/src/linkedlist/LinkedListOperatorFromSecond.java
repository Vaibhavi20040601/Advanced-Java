package linkedlist;

import java.util.*;

public class LinkedListOperatorFromSecond {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println("LinkedList: " + colors);
        System.out.println("Iterating from 2nd position (index 1):");

        Iterator<String> iterator = colors.listIterator(1);
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}

