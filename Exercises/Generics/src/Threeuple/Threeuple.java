package Threeuple;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class Threeuple<K, V, E> implements Threeuplable<K, V, E> {

    private K key;
    private V value;
    private E element;

    public Threeuple() {
    }

    public K getKey() {
        return this.key;
    }

    private void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    @Override
    public E getElement() {
        return this.element;
    }

    @Override
    public void put(K key, V value, E el) {
        this.key = key;
        this.value = value;
        this.element = el;
    }

    private void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.key, this.value, this.element);
    }
}
