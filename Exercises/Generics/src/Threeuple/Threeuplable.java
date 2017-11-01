package Threeuple;

/**
 * Created by Niki on 15.7.2016 г..
 */
public interface Threeuplable<K, V, E> {

    K getKey();

    V getValue();

    E getElement();

    void put(K key, V value, E el);
}
