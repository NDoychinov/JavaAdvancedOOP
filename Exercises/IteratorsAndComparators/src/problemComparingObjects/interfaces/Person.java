package problemComparingObjects.interfaces;

/**
 * Created by Niki on 19.7.2016 г..
 */
public interface Person extends Comparable<Person> {

    String getName();

    int getAge();

    String getTown();
}
