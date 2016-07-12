package MultipleImplementation;

import MultipleImplementation.interfaces.Birthable;
import MultipleImplementation.interfaces.Identifiable;
import MultipleImplementation.interfaces.Person;

/**
 * Created by Niki on 11.7.2016 г..
 */
public class Citizen implements Person, Birthable, Identifiable {

    private String name;
    private int age;

    public Citizen(String name, int age, String id, String birthday) {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String birthdate() {
        return null;
    }

    @Override
    public String id() {
        return null;
    }
}
