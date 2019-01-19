package Uca.Collections;

public interface List<T> extends Collections<T> {

    public void remove(int index);

    public T get(int index);

    public void add(T element , int index);
      
}
