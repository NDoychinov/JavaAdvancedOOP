package problemLinkedListTraversal.interfaces;

/**
 * Created by Niki on 20.7.2016 г..
 */
public interface MyLinkedList<T> extends Iterable<T> {

    void add(T el);

    boolean remove(T el);

    int getSize();
}
