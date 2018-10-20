package Uca.Collections;

// here y implies that T is an object one cannot use primitive data types here.
// for T thir is a need of an object  only.
public interface Iterator<T> {

    public boolean hasNext();

    public T Next();
}
