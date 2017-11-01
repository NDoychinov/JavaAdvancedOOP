package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.SpyImpl;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Spy extends Soldier implements SpyImpl {

    private int code;

    public Spy(String id, String firstName, String lastName, int code) {
        super(id, firstName, lastName);
        this.code = code;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s%nCode Number: %d",
                super.getFirstName(),
                super.getLastName(),
                super.getId(),
                this.code);
    }
}
