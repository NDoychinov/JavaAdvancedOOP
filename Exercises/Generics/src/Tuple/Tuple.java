package Tuple;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class Tuple<K, V> implements Tuplable<K, V> {

    private K key;
    private V value;

    public Tuple() {
    }

    public K getKey() {
        return key;
    }

    private void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public void put(K key, V value) {
        this.setKey(key);
        this.setValue(value);
    }

    private void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.key, this.value);
    }
}
