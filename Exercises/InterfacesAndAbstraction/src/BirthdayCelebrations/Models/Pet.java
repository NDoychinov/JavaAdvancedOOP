package BirthdayCelebrations.Models;

import BirthdayCelebrations.Interfaces.Birthdatable;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Pet implements Birthdatable{
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthdate() {
        return this.birthDate;
    }

}
