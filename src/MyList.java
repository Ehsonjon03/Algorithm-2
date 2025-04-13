public class ArrayList<T> implements MyList<T> {
    private Object[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    // Constructor initializes internal array with default capacity
    public ArrayList() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // Ensures that the internal array has enough capacity to add new elements
    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    // Adds item to the end of the list
    @Override
    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }

    // Sets the value at a specific index
    @Override
    public void set(int index, T item) {
        checkIndex(index);
        data[index] = item;
    }

    // Adds item at a specific index and shifts other elements
    @Override
    public void add(int index, T item) {
        checkIndexForAdd(index);
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = item;
        size++;
    }

    // Adds item to the beginning of the list
    @Override
    public void addFirst(T item) {
        add(0, item);
    }

    // Adds item to the end of the list (same as add)
    @Override
    public void addLast(T item) {
        add(item);
    }

    // Returns the element at a specific index
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // Returns the first element
    @Override
    public T getFirst() {
        return get(0);
    }

    // Returns the last element
    @Override
    public T getLast() {
        return get(size - 1);
    }

    // Removes the element at a specific index and shifts others
    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null; // Avoid memory leak
    }

    // Removes the first element
    @Override
    public void removeFirst() {
        remove(0);
    }

    // Removes the last element
    @Override
    public void removeLast() {
        remove(size - 1);
    }

    // Sorts the list using bubble sort (elements must be Comparable)
    @SuppressWarnings("unchecked")
    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Comparable<T> a = (Comparable<T>) data[j];
                T b = (T) data[j + 1];
                if (a.compareTo(b) > 0) {
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Returns the index of the first occurrence of an object, or -1
    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(object)) return i;
        }
        return -1;
    }

    // Returns the index of the last occurrence of an object, or -1
    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(object)) return i;
        }
        return -1;
    }

    // Checks if an object exists in the list
    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    // Converts list contents to an array
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) array[i] = data[i];
        return array;
    }

    // Clears the list
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) data[i] = null;
        size = 0;
    }

    // Returns the current number of elements in the list
    @Override
    public int size() {
        return size;
    }

    // Returns an iterator to traverse the list
    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private int index = 0;

            public boolean hasNext() {
                return index < size;
            }

            @SuppressWarnings("unchecked")
            public T next() {
                return (T) data[index++];
            }
        };
    }

    // Checks if index is within valid range for get/set/remove
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }

    // Checks if index is valid for adding an element
    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }
}
