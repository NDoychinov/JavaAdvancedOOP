package problemStrategyPattern.interfaces;

/**
 * Created by Niki on 19.7.2016 г..
 */
public interface Person extends NameComparable, AgeComparable {

    String getName();

    int getAge();
}
