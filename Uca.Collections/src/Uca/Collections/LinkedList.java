package Uca.Collections;

public class LinkedList<T> implements List<Object> {

    private class node<T> {

        T data;
        node next;

        public node(T d) {
            data = d;
            next = null;
        }
    }
    private node head;

    @Override
    public void removeSomeIndex() {

    }

    @Override
    public Object getFromIndex(int index) {
        node temp = head;
        int c = 0;
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
    }

    @Override
    public void add(Object t) {
        
    }

    @Override
    public void remove(Object t) {
        
    }

    @Override
    public int size(Object t) {
        
    }
    @Override
    public Iterator iterator() {

    }
}
