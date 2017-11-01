package problemListyIterator;

import problemListyIterator.interfaces.Iterator;

import java.util.LinkedList;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class ListyIterator<E> implements Iterator<E> {

    private LinkedList<E> list;
    private int index;

    public ListyIterator() {
        this.list = new LinkedList<E>();
        this.index = 0;
    }

    @Override
    public boolean move() {
        if (this.hasNext()) {
            this.index++;
            return true;
        }

        return false;
    }

    @Override
    public void print() {
        if (this.list.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        System.out.println(this.list.get(this.index));
    }

    @Override
    public boolean hasNext() {
        int nextPoss = this.index + 1;

        if (nextPoss < this.list.size()) {
            return true;
        }

        return false;
    }

    @Override
    public void addEl(E el) {
        this.list.add(el);
    }
}
