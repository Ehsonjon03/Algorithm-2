public class LinkedListTest {
    public static void main(String[] args) {
        // Create a new LinkedList of Strings
        MyList<String> list = new LinkedList<>();

        System.out.println("=== Testing Add ===");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        printList(list);

        System.out.println("=== Testing Add First & Last ===");
        list.addFirst("First");
        list.addLast("Last");
        printList(list);

        System.out.println("=== Testing Add at Index ===");
        list.add(2, "Middle");
        printList(list);

        System.out.println("=== Testing Get ===");
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("At index 2: " + list.get(2));

        System.out.println("=== Testing Set ===");
        list.set(2, "UpdatedMiddle"); // Replace "Middle" with "UpdatedMiddle"
        printList(list);

        System.out.println("=== Testing Remove ===");
        list.remove(2); // Remove "UpdatedMiddle"
        list.removeFirst(); // Remove "First"
        list.removeLast();  // Remove "Last"
        printList(list);

        System.out.println("=== Testing Sort ===");
        list.sort(); // Sorts alphabetically
        printList(list);

        System.out.println("=== Testing Search ===");
        System.out.println("Index of Banana: " + list.indexOf("Banana"));
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));
        System.out.println("Exists Cherry? " + list.exists("Cherry"));
        System.out.println("Exists Mango? " + list.exists("Mango"));

        System.out.println("=== Testing toArray ===");
        Object[] arr = list.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println("=== Testing Clear ===");
        list.clear(); // Empties the list
        printList(list);
        System.out.println("Size: " + list.size());
    }

    // Utility method to print list contents and size
    public static void printList(MyList<?> list) {
        System.out.print("List: ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println("\nSize: " + list.size());
    }
}
