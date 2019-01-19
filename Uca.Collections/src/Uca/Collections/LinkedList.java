package Uca.Collections;

public class LinkedList<T> implements List<T> {

    private node head;
    private int index;

    private class node {

        T data;
        node next;

        public node(T d) {
            data = d;
            next = null;
        }
    }

    public LinkedList() {
        index = 0;
    }

    @Override
    public void add(T element) {
        head = add(element, head);
        index++;
    }

    @Override
    public void add(T element, int index) {
        head = add(element, index, head);
        index++;
    }

    private node add(T t, int index, node n) {
        if (index == 0) {
            node temp = new node(t);
            temp.next = n;
            return temp;
        }
        n.next = add(t, index - 1, n.next);
        return n;
    }

    private node add(T t, node n) {
        if (n == null) {
            return new node(t);
        }
        return add(t, n.next);
    }

    @Override
    public void remove(T t) {
        head = remove(t, head);
        index--;
    }

    private node remove(T t, node n) {
        if (n == null) {
            return null;
        }
        if (n.data.equals(t)) {
            return n.next;
        }

        n.next = remove(t, n.next);
        return n;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean contains(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int index) {
        node temp = head;
        node prev = null;
        int c = 0;
        while (temp.next != null && c != index) {
            prev = temp;
            temp = temp.next;
            c++;
        }
        if (temp.next != null) {
            prev.next = temp.next;
        }
        head = prev;
    }

    @Override
    public T get(int index) {
        node temp = head;
        int c = 0;
        while (temp.next != null && c != index) {
            temp = temp.next;
            c++;
        }
        if (temp == null) {
            return null;
        }
        return temp.data;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        index = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private node t = head;

            @Override
            public boolean hasNext() {
                return t != null;
            }

            @Override
            public T Next() {
                T e = t.data;
                t = t.next;
                return e;
            }
        };
    }
}
