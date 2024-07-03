package wk7;

public class CircularQueue<E> implements PureQueue<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private E[] items;
    private int front;
    private int back;
    private boolean isEmpty;

    public CircularQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CircularQueue(int capacity) {
        items = (E[]) new Object[capacity];
        front = 0;
        back = 0;
        isEmpty = true;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean offer(E item) {
        boolean added = false;
        if (isEmpty || front != back) {
            added = true;
            items[front] = item;
            front = (front + 1) % items.length;
            isEmpty = false;
        }
        return added;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        E value = null;
        if (!isEmpty) {
            value = items[back];
        }
        return value;
    }
}
