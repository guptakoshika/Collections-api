package Uca.Collections;

public interface collections<T extends Comparable<T>> extends Iterable<T> {
    public void add(T t);
    public void remove(T t);
    public boolean isEmpty();
    public void clear();
    public boolean isFull();
    public int size(T t);
}
