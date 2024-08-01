package wk8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class BST implements Set<String> {

    private class Node {
        String value;
        // TODO update rest of BST code to manage parent reference
        Node parent;
        Node lKid;
        Node rKid;

        Node(String value, Node parent) {
            this.value = value;
            this.parent = parent;
        }

        Node(String value) {
            this(value, null);
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    /*

     */
    private Node rightRotate(Node C) {
        Node B = C.lKid;
        Node y = B.rKid;
        Node parent = C.parent;
        B.parent = parent;
        C.lKid = y;
        B.rKid = C;
        if (y != null) {
            y.parent = C;
        }
        C.parent = B;
        if (parent != null) {
            if (parent.rKid == C) {
                parent.rKid = B;
            } else {
                parent.lKid = B;
            }
        }
        return B;
    }

    private Node leftRotate(Node A) {
        Node B = A.rKid;
        Node parent = A.parent;
        Node x = B.lKid;
        A.parent = B;
        B.lKid = A;
        A.lKid = x;
        if (x != null) {
            x.parent = A;
        }
        B.parent = parent;
        if(parent.lKid == A){
            parent.lKid = B;
        } else {
            parent.rKid = B;
        }
        return B;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object target) {
        return target instanceof String && contains(root, (String) target);
    }

    private boolean contains(Node subroot, String target) {
        if (subroot == null) {
            return false;
        }
        if (subroot.value.equals(target)) {
            return true;
        } else if (subroot.value.compareTo(target) > 0) {
            return contains(subroot.lKid, target);
        } else {
            return contains(subroot.rKid, target);
        }
    }

    public void preOrder(Consumer<String> consumer) {
        preOrder(consumer, root);
    }

    public void postOrder(Consumer<String> consumer) {
        postOrder(consumer, root);
    }

    public void inOrder(Consumer<String> consumer) {
        inOrder(consumer, root);
    }

    private void inOrder(Consumer<String> consumer, Node subroot) {
        if (subroot != null) {
            inOrder(consumer, subroot.lKid);
            consumer.accept(subroot.value);
            inOrder(consumer, subroot.rKid);
        }
    }

    private void preOrder(Consumer<String> consumer, Node subroot) {
        if (subroot != null) {
            consumer.accept(subroot.value);
            preOrder(consumer, subroot.lKid);
            preOrder(consumer, subroot.rKid);
        }
    }

    private void postOrder(Consumer<String> consumer, Node subroot) {
        if (subroot != null) {
            postOrder(consumer, subroot.lKid);
            postOrder(consumer, subroot.rKid);
            consumer.accept(subroot.value);
        }
    }

    @Override
    public boolean add(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Tree does not support nulls");
        }
        boolean added = false;
        if (root == null) {
            root = new Node(s);
            added = true;
        } else {
            added = add(root, s);
        }
        return added;
    }

    private boolean add(Node subroot, String s) {
        boolean added = false;
        int compareResult = s.compareTo(subroot.value);
        if (compareResult < 0) {
            if (subroot.lKid == null) {
                subroot.lKid = new Node(s);
                added = true;
            } else {
                added = add(subroot.lKid, s);
            }
        } else if (compareResult > 0) {
            if (subroot.rKid == null) {
                subroot.rKid = new Node(s);
                added = true;
            } else {
                added = add(subroot.rKid, s);
            }
        }
        return added;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node subroot) {
        return subroot == null ? 0 : 1 + size(subroot.lKid) + size(subroot.rKid);
    }

    public int height() {
        return height(root);
    }

    private int height(Node subroot) {
        return subroot == null ? 0 : 1 + Math.max(height(subroot.lKid), height(subroot.rKid));
    }

    @Override
    public Iterator<String> iterator() {
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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
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
