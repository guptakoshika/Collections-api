package Uca.Collections;

public class ArrayList<T> implements List<T>{

    private int size;
    
    @Override
    public void remove(int index) {
        
    }

    @Override
    public T get(int index) {
        
    }

    @Override
    public void add(T element, int index) {
        
    }

    @Override
    public void add(T t) {
        
    }

    @Override
    public void remove(T t) {
        
    }

    @Override
    public boolean isEmpty() {
      return size() == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private int indexOf(T t){
        
       return -1;
    }
    @Override
    public boolean contains(T t) {
        return indexOf(t) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
