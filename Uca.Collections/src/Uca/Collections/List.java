package Uca.Collections;

public interface List<T> extends Collections<T> {

    public void removeSomeIndex(int index);

    public T getFromIndex(int index);

    public void add(T element);
}
