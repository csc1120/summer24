package wk7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack<E> implements PureStack<E> {
    private List<E> items;

    public Stack() {
        items = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public void push(E item) {
        items.add(0, item);
    }

    @Override
    public E pop() {
        return items.remove(0);
    }

    @Override
    public E peek() {
        return items.get(0);
    }
}
