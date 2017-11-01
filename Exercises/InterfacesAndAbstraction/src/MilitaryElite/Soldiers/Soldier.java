package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.SoldierImpl;

/**
 * Created by Niki on 12.7.2016 г..
 */
public abstract class Soldier implements SoldierImpl {
    private String firstName;
    private String lastName;
    private String id;

    public Soldier(String id, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
