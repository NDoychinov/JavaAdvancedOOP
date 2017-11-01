package CollectionHierarchy;

import CollectionHierarchy.interfaces.MyList;

import java.util.LinkedList;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class MyListImpl implements MyList {
    private LinkedList<String> data;

    public MyListImpl() {
        this.data = new LinkedList<>();
    }

    @Override
    public int used() {
        return this.data.size();
    }

    @Override
    public String remove() {
        String firstItem = this.data.getFirst();
        this.data.removeFirst();
        return firstItem;
    }

    @Override
    public int add(String str) {
        this.data.addFirst(str);
        return 0;
    }
}
