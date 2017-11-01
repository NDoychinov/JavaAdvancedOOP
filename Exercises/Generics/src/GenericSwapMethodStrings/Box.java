package GenericSwapMethodStrings;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class Box<T> {

    private T type;

    public Box(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.getClass().getName() + ": " + type;
    }
}
