package wk10;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashTable<E> implements Set<E> {
    private LinkedList<E>[] table;
    private int size;
    private static final int DEFAULT_TABLE_SIZE = 7;

    public HashTable() {
        table = new LinkedList[DEFAULT_TABLE_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object target) {
        int index = Math.abs(target.hashCode()) % table.length;
        return table[index] != null && table[index].contains(target);
    }

    @Override
    public boolean add(E e) {
        int index = Math.abs(e.hashCode()) % table.length;
        if (table[index] != null) {
            if (table[index].contains(e)) {
                return false;
            }
            table[index].add(e);
            ++size;
        } else {
            table[index] = new LinkedList<>();
            table[index].add(e);
            ++size;
        }
        return true;
    }

    @Override
    public boolean remove(Object target) {
        int index = Math.abs(target.hashCode()) % table.length;
        boolean removed = table[index] != null && table[index].remove(target);
        if (removed) {
            --size;
        }
        return removed;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
