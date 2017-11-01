package BirthdayCelebrations.Models;

import BirthdayCelebrations.Interfaces.Buyer;
import BirthdayCelebrations.Interfaces.Groupable;
import BirthdayCelebrations.Interfaces.Person;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Rebel implements Person, Groupable, Buyer{
    private String name;
    private int age;
    private String group;
    private int foodAmount;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.foodAmount = 0;
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
    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {
        this.foodAmount += 5;
    }
}
