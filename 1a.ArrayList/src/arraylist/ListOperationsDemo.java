package arraylist;
import java.util.*;

public class ListOperationsDemo {

    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("1. Initial ArrayList: " + arrayList);
        System.out.println("   Initial LinkedList: " + linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");
        System.out.println("\n2. After adding 'Mango' at index 1:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 3. Adding multiple elements
        List<String> extraFruits = Arrays.asList("Grapes", "Pineapple");
        arrayList.addAll(extraFruits);
        linkedList.addAll(extraFruits);
        System.out.println("\n3. After adding multiple elements:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 4. Accessing elements
        System.out.println("\n4. Element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("   Element at index 2 in LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");
        System.out.println("\n5. After updating index 0:");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");
        System.out.println("\n6. After removing 'Banana':");
        System.out.println("   ArrayList: " + arrayList);
        System.out.println("   LinkedList: " + linkedList);

        // 7. Searching elements
        boolean containsApple = arrayList.contains("Apple");
        System.out.println("\n7. Does ArrayList contain 'Apple'? " + containsApple);
        System.out.println("   Does LinkedList contain 'Apple'? " + linkedList.contains("Apple"));

        // 8. List size
        System.out.println("\n8. Size of ArrayList: " + arrayList.size());
        System.out.println("   Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("\n9. Iterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println("   " + fruit);
        }

        // 10. Using Iterator
        System.out.println("\n10. Using Iterator for LinkedList:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort((List<String>) linkedList);
        System.out.println("\n11. Sorted ArrayList: " + arrayList);
        System.out.println("    Sorted LinkedList: " + linkedList);

        // 12. Sublist
        List<String> subListArray = arrayList.subList(1, 3);
        List<String> subListLinked = linkedList.subList(1, 3);
        System.out.println("\n12. Sublist from index 1 to 3:");
        System.out.println("    ArrayList Sublist: " + subListArray);
        System.out.println("    LinkedList Sublist: " + subListLinked);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("\n13. After clearing:");
        System.out.println("    ArrayList: " + arrayList);
        System.out.println("    LinkedList: " + linkedList);
    }
}
