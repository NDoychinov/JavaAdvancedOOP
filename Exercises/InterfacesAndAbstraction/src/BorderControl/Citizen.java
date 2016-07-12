package BorderControl;

import BorderControl.interfaces.Identifiable;
import BorderControl.interfaces.Person;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Citizen implements Person, Identifiable{

    private String name;
    private int age;
    private String id;

    Citizen(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
