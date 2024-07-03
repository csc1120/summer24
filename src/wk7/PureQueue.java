package wk7;

public interface PureQueue<E> {
    boolean isEmpty();
    boolean offer(E item);
    E poll();
    E peek();
}
