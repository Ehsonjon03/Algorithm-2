public class StackTest {
    public static void main(String[] args) {
        // Creating a new instance of Stack with Integer type
        Stack<Integer> stack = new Stack<>(); // Renamed from MyStack to Stack

        // Testing the 'push' operation
        System.out.println("=== Testing Push ===");
        stack.push(10); // Pushes 10 onto the stack
        stack.push(20); // Pushes 20 onto the stack
        stack.push(30); // Pushes 30 onto the stack
        System.out.println(stack); // Prints the stack after pushing elements

        // Testing the 'peek' operation
        System.out.println("=== Testing Peek ===");
        System.out.println("Peek: " + stack.peek()); // Peeks at the top element of the stack (should return 30)

        // Testing the 'pop' operation
        System.out.println("=== Testing Pop ===");
        System.out.println("Popped: " + stack.pop()); // Pops the top element (should remove 30)
        System.out.println(stack); // Prints the stack after popping an element

        // Testing the 'size' and 'isEmpty' operations
        System.out.println("=== Testing Size and Empty ===");
        System.out.println("Size: " + stack.size()); // Prints the current size of the stack
        System.out.println("Is Empty? " + stack.isEmpty()); // Checks if the stack is empty (false in this case)

        // Testing the 'clear' operation
        System.out.println("=== Testing Clear ===");
        stack.clear(); // Clears the stack
        System.out.println("Is Empty after clear? " + stack.isEmpty()); // Checks if the stack is empty after clearing (should be true)
    }
}
