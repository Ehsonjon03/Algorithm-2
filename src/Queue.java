public class Queue<T> {
    private MyLinkedList<T> list;

    public Queue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item); // Add to tail (back of the queue)
    }

    public T dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        T item = list.getFirst(); // Get from head (front of the queue)
        list.removeFirst(); // Remove the front element
        return item;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return list.getFirst(); // Peek at the front element without removing it
    }

    public boolean isEmpty() {
        return list.size() == 0; // Checks if the queue is empty
    }

    public int size() {
        return list.size(); // Returns the current size of the queue
    }

    public void clear() {
        list.clear(); // Clears all elements from the queue
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue (front -> back): ");
        for (T item : list) {
            sb.append(item).append(" "); // Builds a string representation of the queue
        }
        return sb.toString();
    }
}
