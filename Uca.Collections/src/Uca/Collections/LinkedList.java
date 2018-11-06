package Uca.Collections;

public class LinkedList<T> implements List<T> {

    private class node {

        T data;
        node next;

        public node(T d) {
            data = d;
            next = null;
        }
    }
    private node head;
    int index;

    public LinkedList() {
        index = 0;
    }

    @Override
    public void add(T t) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node n = new node(t);
        temp.next = n;
        head = temp;
        index++;
    }

    @Override
    public void remove(T t) {
        node temp = head;
        while (temp != null && temp != t) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public void removeSomeIndex(int index) {
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
    public T getFromIndex(int index) {

        node temp = head;
        Integer c = 0;
        while (temp.next != null && c != index) {
            temp = temp.next;
            c++;
        }
        return temp.data;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
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
