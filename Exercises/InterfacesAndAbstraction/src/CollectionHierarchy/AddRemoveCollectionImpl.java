package CollectionHierarchy;

import CollectionHierarchy.interfaces.AddRemoveCollection;

import java.util.LinkedList;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class AddRemoveCollectionImpl implements AddRemoveCollection {
    private LinkedList<String> data;

    AddRemoveCollectionImpl() {
        this.data = new LinkedList<>();
    }

    @Override
    public String remove() {
        String lastItem = this.data.getLast();
        this.data.removeLast();
        return lastItem;
    }

    @Override
    public int add(String str) {
        this.data.addFirst(str);

        return 0;
    }
}
