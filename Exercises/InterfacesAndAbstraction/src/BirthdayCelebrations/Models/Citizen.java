package BirthdayCelebrations.Models;

import BirthdayCelebrations.Interfaces.Birthdatable;
import BirthdayCelebrations.Interfaces.Buyer;
import BirthdayCelebrations.Interfaces.Identifiable;
import BirthdayCelebrations.Interfaces.Person;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Citizen implements Person, Identifiable, Birthdatable, Buyer{

    private String name;
    private int age;
    private String id;
    private String birthdate;
    private int foodAmount;

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
        this.foodAmount = 0;
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
    public int foodAmount() {
        return this.foodAmount;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    @Override
    public void buyFood() {
        this.foodAmount += 10;
    }
}
