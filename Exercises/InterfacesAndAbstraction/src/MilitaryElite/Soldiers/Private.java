package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.Salaryable;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Private extends Soldier implements Salaryable {

    private Double salary;

    public Private(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f", super.getFirstName(),
                super.getLastName(),
                super.getId(),
                this.salary);
    }
}
