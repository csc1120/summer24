package wk7;

public interface PureStack<E> {
    boolean isEmpty();
    void push(E item);
    E pop();
    E peek();
}
