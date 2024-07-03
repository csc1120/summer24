package wk7;

import java.util.LinkedList;

public class Queue<E> implements PureQueue<E> {
    private LinkedList<E> items;

    public Queue() {
        items = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean offer(E item) {
        if (item == null) {
            throw new NullPointerException("Nulls not allowed in this queue");
        }
        items.add(item);
        return true;
    }

    @Override
    public E poll() {
        return items.remove(0);
    }

    @Override
    public E peek() {
        return items.get(0);
    }
}
