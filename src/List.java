// Custom generic List interface extending Iterable
public interface List<T> extends Iterable<T> {

    // Adds an item to the end of the list
    void add(T item);

    // Replaces the item at the specified index
    void set(int index, T item);

    // Inserts an item at the specified index
    void add(int index, T item);

    // Adds an item to the beginning of the list
    void addFirst(T item);

    // Adds an item to the end of the list
    void addLast(T item);

    // Retrieves the item at the specified index
    T get(int index);

    // Retrieves the first item in the list
    T getFirst();

    // Retrieves the last item in the list
    T getLast();

    // Removes the item at the specified index
    void remove(int index);

    // Removes the first item in the list
    void removeFirst();

    // Removes the last item in the list
    void removeLast();

    // Sorts the list using natural ordering
    void sort();

    // Returns the index of the first occurrence of the object, or -1 if not found
    int indexOf(Object object);

    // Returns the index of the last occurrence of the object, or -1 if not found
    int lastIndexOf(Object object);

    // Checks if the object exists in the list
    boolean exists(Object object);

    // Returns the list as a regular array
    Object[] toArray();

    // Clears all elements from the list
    void clear();

    // Returns the number of elements in the list
    int size();
}
