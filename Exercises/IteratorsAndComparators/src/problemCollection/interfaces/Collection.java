package problemCollection.interfaces;

/**
 * Created by Niki on 19.7.2016 г..
 */
public interface Collection<E> extends Iterator, Printable {

    void addEl(E el);
}
