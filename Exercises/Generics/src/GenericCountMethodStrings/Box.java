package GenericCountMethodStrings;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class Box<T extends Comparable<T>> implements Comparable<T> {

    private T value;

    public Box(T type) {
        this.value = type;
    }


    @Override
    public String toString() {
        return value.getClass().getName() + ": " + value;
    }

    public T getItem(){
        return  this.value;
    }

    @Override
    public int compareTo(T e) {
        return value.compareTo(e);
    }
}
