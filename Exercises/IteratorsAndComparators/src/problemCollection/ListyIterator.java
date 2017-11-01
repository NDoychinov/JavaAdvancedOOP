package problemCollection;

import problemCollection.interfaces.Collection;

import java.util.LinkedList;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class ListyIterator<E> implements Collection<E> {

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
    public void printAll() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < this.list.size(); i++) {
            output.append(this.list.get(i)).append(" ");
        }
        System.out.println(output);
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
