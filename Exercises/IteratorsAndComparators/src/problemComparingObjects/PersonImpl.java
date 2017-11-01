package problemComparingObjects;

import problemComparingObjects.interfaces.Person;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class PersonImpl implements Person {

    private String name;
    private int age;
    private String town;


    public PersonImpl(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
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
    public String getTown() {
        return this.town;
    }

    public int compareTo(Person person) {
        if (this.name.compareTo(person.getName()) == 0 &&
                Integer.compare(this.age, person.getAge()) == 0 &&
                this.town.compareTo(person.getTown()) == 0) {
            return 0;
        }
        return 1;
    }
}
