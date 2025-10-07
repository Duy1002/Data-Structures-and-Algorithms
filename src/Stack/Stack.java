package Stack;

public class Stack<T> {
    private int size, capacity;
    private Object[] stack;

    public Stack() {
        size = 0;
        stack = new Object[capacity = 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        if (size == capacity) {
            Object[] new_stack = new Object[capacity <<= 1];
            for (int i = 0; i < size; ++i) new_stack[i] = stack[i];
            stack = new_stack;
        }
        stack[size++] = item;
    }

    public T pop() {
        if (empty() == true) throw new RuntimeException("Stack underflow");
        T item = (T) stack[--size];
        stack[size] = null; // memory leak!!
        return item;
    }

    public T peek() {
        if (empty() == true) throw new RuntimeException("Stack underflow");
        return (T) stack[size - 1];
    }

    public T get(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException();
        return (T) stack[i];
    }
}
