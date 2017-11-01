package problemPetClinics;

import problemPetClinics.interfaces.Pet;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class PetImpl implements Pet {

    private String name;
    private int age;
    private String kind;

    public PetImpl(String name, int age, String kind) {
        this.setName(name);
        this.setAge(age);
        this.setKind(kind);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setKind(String kind) {
        this.kind = kind;
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
    public String getKind() {
        return this.kind;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.age, this.kind);
    }
}
