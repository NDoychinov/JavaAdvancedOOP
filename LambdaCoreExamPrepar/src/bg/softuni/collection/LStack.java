package bg.softuni.collection;

import bg.softuni.models.fragments.Fragment;

import java.util.LinkedList;

public class LStack implements CustomStack {

    private LinkedList<Fragment> innerList;

    public LStack() {
        this.innerList = new LinkedList<Fragment>();
    }

    @Override
    public Integer size() {
        return this.innerList.size();
    }

    @Override
    public Fragment push(Fragment item) {
        this.innerList.addLast(item);
        return item;
    }

    @Override
    public Fragment pop() {
        return this.innerList.removeLast();
    }

    @Override
    public Fragment peek() {
        return this.innerList.getLast();
    }

    @Override
    public Boolean isEmpty() {
        return this.innerList.isEmpty();
    }
}