package customList.myList;

import customList.interfaces.MyList;

import java.util.LinkedList;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class MyListImpl<T extends Comparable> implements MyList<T> {

    private LinkedList<T> data;
    private int count = 0;

    public MyListImpl() {
        this.data = new LinkedList<T>();
    }

    @Override
    public T get(int index) {
        return this.data.get(index);
    }

    @Override
    public void add(T element) {
        this.data.add(element);
    }

    @Override
    public Object remove(int index) {
        return this.data.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.data.contains(element);
    }

    @Override
    public void swap(int index, int index1) {
        T el1 = this.data.get(index1);
        this.data.set(index1, this.data.get(index));
        this.data.set(index, el1);
    }

    @Override
    public int countGreaterThat(T element) {
        int count = 0;
        for (T aData : this.data) {
            if (element.compareTo(aData) < 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public T getMax() {

        if (this.data.size() > 0) {
            T maxEl = this.data.get(0);

            for (int i = 1; i < this.data.size(); i++) {
                if (maxEl.compareTo(this.data.get(i)) < 0) {
                    maxEl = this.data.get(i);
                }
            }

            return maxEl;
        }

        return null;
    }

    @Override
    public T getMin() {

        if (this.data.size() > 0) {
            T minEl = this.data.get(0);

            for (int i = 1; i < this.data.size(); i++) {
                if (minEl.compareTo(this.data.get(i)) > 0) {
                    minEl = this.data.get(i);
                }
            }

            return minEl;
        }

        return null;
    }

    @Override
    public void sortAscending() {
        this.data = Sorter.sortAscending(this.data);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        for (T aData : this.data) {
            out.append(aData).append(System.lineSeparator());
        }

        return out.toString();
    }
}
