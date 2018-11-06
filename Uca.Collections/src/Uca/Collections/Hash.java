package Uca.Collections;

import java.util.LinkedList;

public class Hash<T> implements Hashset<T>{

    private int size;
    private double loadfactor;
    private LinkedList<T> bucket[];

    public Hash(int size, double loadfactor) {
        this.size = size;
        this.loadfactor = loadfactor;
    }
    
    public Hash() {
        this(16, 0.75);
    }

    @Override
    public void add(T e) {
        
    }

    @Override
    public void remove(T t) {
     
    }

    @Override
    public boolean isEmpty() {
        
    }

    @Override
    public void clear() {
        
    }

    @Override
    public int size(T t) {
       
    }

    @Override
    public Iterator iterator() {
       
    }
}