package problemListyIterator.interfaces;

/**
 * Created by Niki on 19.7.2016 г..
 */
public interface Iterator<E> {

    boolean move();

    void print();

    boolean hasNext();

    void addEl(E el);
}
