package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.Corpsable;
import MilitaryElite.Interfaces.Salaryable;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class SpecialisedSoldier extends Soldier implements Salaryable, Corpsable {

    private double salary;
    private String corps;


    public SpecialisedSoldier(String firstName, String lastName, String id, double salary, String corps) {
        super(firstName, lastName, id);
        this.salary = salary;
        if (isValidCorps(corps)) {
            this.corps = corps;
        } else {
            throw new IllegalArgumentException("Not valid corps");
        }
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public boolean isValidCorps(String corps) {
        if (corps.equals("Airforces") || corps.endsWith("Marines")){
            return true;
        }
        return false;
    }
}
