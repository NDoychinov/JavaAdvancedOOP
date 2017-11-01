package problemLinkedListTraversal;

import problemLinkedListTraversal.interfaces.MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Niki on 20.7.2016 г..
 */
public class MyLinkedListImpl<T> implements MyLinkedList<T> {
    private LinkedList<T> items;

    public MyLinkedListImpl() {
        this.items = new LinkedList<T>();
    }

    @Override
    public void add(T el) {
        this.items.add(el);
    }

    @Override
    public boolean remove(T el) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).equals(el)){
                this.items.remove(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public int getSize() {
        return this.items.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        int index;

        private ListIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < items.size();
        }

        @Override
        public T next() {
            if (this.hasNext()){
                return items.get(index++);
            }
            throw new NoSuchElementException();
        }
    }
}
