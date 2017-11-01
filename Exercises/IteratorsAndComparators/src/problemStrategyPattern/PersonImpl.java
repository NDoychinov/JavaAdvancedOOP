package problemStrategyPattern;

import problemStrategyPattern.interfaces.Person;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class PersonImpl implements Person {

    private String name;
    private int age;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareByAge(Person person) {
        return Integer.compare(this.age, person.getAge());
    }

    @Override
    public int compareByName(Person person) {
        String person1Name = this.name.toLowerCase();
        String person2Name = person.getName().toLowerCase();
        int lenghtCompare = Integer.compare(person1Name.length(), person2Name.length());
        if (lenghtCompare != 0) {
            return lenghtCompare;
        }
        return Integer.compare(person1Name.charAt(0),
                person2Name.charAt(0));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }
}
