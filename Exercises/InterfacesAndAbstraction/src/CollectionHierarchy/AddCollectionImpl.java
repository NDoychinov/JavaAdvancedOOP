package CollectionHierarchy;

import CollectionHierarchy.interfaces.AddCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class AddCollectionImpl implements AddCollection {
    private List<String> data;

    public AddCollectionImpl() {
        this.data = new ArrayList<>();
    }

    @Override
    public int add(String str) {
        int addPoss = data.size();
        this.data.add(str);
        return addPoss;
    }
}
