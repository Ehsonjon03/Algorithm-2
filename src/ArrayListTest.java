public class ArrayListTest {
    public static void main(String[] args) {
        // Create a new ArrayList of Integers
        MyList<Integer> list = new ArrayList<>();

        System.out.println("=== Testing Add ===");
        // Add elements to the end
        list.add(10);
        list.add(20);
        list.add(30);
        printList(list);

        System.out.println("=== Testing Add First & Last ===");
        // Add to the beginning and end
        list.addFirst(5);
        list.addLast(40);
        printList(list);

        System.out.println("=== Testing Add at Index ===");
        // Add element at specific index
        list.add(2, 15); // Between 10 and 20
        printList(list);

        System.out.println("=== Testing Get ===");
        // Retrieve elements from the list
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("At index 2: " + list.get(2));

        System.out.println("=== Testing Set ===");
        // Update an element at a specific index
        list.set(2, 17);
        printList(list);

        System.out.println("=== Testing Remove ===");
        // Remove specific elements
        list.remove(2); // Remove 17
        list.removeFirst(); // Remove first element (5)
        list.removeLast();  // Remove last element (40)
        printList(list);

        System.out.println("=== Testing Sort ===");
        // Sort the list
        list.sort();
        printList(list);

        System.out.println("=== Testing Search ===");
        // Search for elements
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));
        System.out.println("Exists 30? " + list.exists(30));
        System.out.println("Exists 99? " + list.exists(99));

        System.out.println("=== Testing toArray ===");
        // Convert list to array and print
        Object[] arr = list.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println("=== Testing Clear ===");
        // Clear the list
        list.clear();
        printList(list);
        System.out.println("Size: " + list.size());
    }

    // Utility method to print contents and size of the list
    public static void printList(MyList<?> list) {
        System.out.print("List: ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println("\nSize: " + list.size());
    }
}
