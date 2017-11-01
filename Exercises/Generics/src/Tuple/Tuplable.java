package Tuple;

/**
 * Created by Niki on 15.7.2016 г..
 */
public interface Tuplable<K, V> {

    K getKey();

    V getValue();

    void put(K key, V value);
}
