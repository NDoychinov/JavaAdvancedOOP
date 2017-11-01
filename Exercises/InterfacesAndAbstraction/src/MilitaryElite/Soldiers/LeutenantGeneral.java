package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.LeutenantImpl;
import MilitaryElite.Interfaces.Salaryable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class LeutenantGeneral extends Soldier implements LeutenantImpl, Salaryable {
    private double salary;
    private List<Private> privateList;

    public LeutenantGeneral(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
        this.privateList = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private privateSoldier) {
        this.privateList.add(privateSoldier);
    }

    @Override
    public List<Private> getPrivates() {
        return this.privateList;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Name: %s %s Id: %s Salary: %.2f%n", super.getFirstName(),
                super.getLastName(),
                super.getId(),
                this.salary)).append("Privates:");

        for (int i = 0; i < privateList.size(); i++) {
            str.append(System.lineSeparator()).append("  ").append(privateList.get(i).toString());
        }
        return str.toString();
    }
}
