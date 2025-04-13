public class MinHeapTest {
    public static void main(String[] args) {
        // Create a MinHeap of Integer type
        MinHeap<Integer> heap = new MinHeap<>();

        // Inserting elements into the heap
        System.out.println("=== Inserting ===");
        heap.insert(40);
        heap.insert(20);
        heap.insert(10);
        heap.insert(50);
        heap.insert(30);
        System.out.println(heap);  // Printing the heap after insertions

        // Peeking the minimum element
        System.out.println("=== Peek Min ===");
        System.out.println("Min: " + heap.peekMin());  // Should display the smallest element (root of the heap)

        // Extracting the minimum element (removes it from the heap)
        System.out.println("=== Extract Min ===");
        System.out.println("Extracted: " + heap.extractMin());  // Extracts the min element
        System.out.println("After Extraction: " + heap);  // Prints the heap after extraction

        // Checking the size and if the heap is empty
        System.out.println("=== Size and Empty ===");
        System.out.println("Size: " + heap.size());  // Size of the heap after operations
        System.out.println("Is Empty? " + heap.isEmpty());  // Checks if the heap is empty

        // Clearing the heap and checking if it is empty afterward
        System.out.println("=== Clear Heap ===");
        heap.clear();  // Clears all elements from the heap
        System.out.println("Is Empty after clear? " + heap.isEmpty());  // Verifies that the heap is now empty
    }
}
