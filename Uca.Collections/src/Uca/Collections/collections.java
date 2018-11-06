package Uca.Collections;

public interface Collections<T> extends Iterable<T> {
    public void add(T t);
    public void remove(T t);
    public boolean isEmpty();
    public void clear();
    public int size();
}
