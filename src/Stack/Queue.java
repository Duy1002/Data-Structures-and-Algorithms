package Stack;

public class Queue<T> {
    private Stack<T> firstToLast, lastToFirst;

    public Queue() {
        firstToLast = new Stack<T>();
        lastToFirst = new Stack<T>();
    }

    public boolean empty() {
        return firstToLast.empty() && lastToFirst.empty();
    }

    public int size() {
        return firstToLast.size() + lastToFirst.size();
    }

    private void rebalance() {
        if (firstToLast.empty() == true)
            while (lastToFirst.empty() == false)
                firstToLast.push(lastToFirst.pop());
    }

    public void push(T item) {
        lastToFirst.push(item);
    }

    public T pop() {
        rebalance();
        return firstToLast.pop();
    }

    public T peek() {
        rebalance();
        return firstToLast.peek();
    }
}
