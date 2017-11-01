package customList.interfaces;

/**
 * Created by Niki on 15.7.2016 г..
 */
public interface MyList<T> {

    T get(int index);

    void add(T element);

    Object remove(int index);

    boolean contains(T element);

    void swap(int index, int index1);

    int countGreaterThat(T element);

    T getMax();

    T getMin();

    void sortAscending();
}
