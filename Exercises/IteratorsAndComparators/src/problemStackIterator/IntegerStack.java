package problemStackIterator;

import problemStackIterator.Interfaces.StackInteger;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class IntegerStack implements StackInteger {

    private LinkedList<Integer> stack;
    private int index;

    public IntegerStack() {
        this.stack = new LinkedList<>();
        this.index = -1;
    }

    @Override
    public void push(Integer num) {
        this.stack.addLast(num);
        index++;
    }

    @Override
    public void pop() {
        if (this.stack.size() <= 0) {
            throw new NoSuchElementException("No elements");
        }
        this.stack.removeLast();
        this.index--;
    }

    @Override
    public boolean move() {
        if (this.hasNext()){
            this.index--;
            return true;
        }

        return false;
    }

    @Override
    public boolean hasNext() {
        int nextPoss = this.index - 1;

        if (nextPoss >= 0) {
            return true;
        }

        return false;
    }


    @Override
    public void print() {
        if (this.stack.size() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        System.out.println(this.stack.get(this.index));
    }

    @Override
    public void printAll() {
        for (int i = this.stack.size() - 1; i >= 0; i--) {
            System.out.println(this.stack.get(i));
        }
    }
}
