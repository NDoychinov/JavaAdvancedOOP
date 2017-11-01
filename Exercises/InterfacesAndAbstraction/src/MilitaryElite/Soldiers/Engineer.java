package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.EngineerImpl;
import MilitaryElite.Interfaces.Repairable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Engineer extends SpecialisedSoldier implements EngineerImpl {

    private List<Repairable> repairList;

    public Engineer(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairList = new ArrayList<>();
    }


    @Override
    public void addRepair(Repairable repair) {
        this.repairList.add(repair);
    }

    @Override
    public List<Repairable> getRepairs() {
        return this.repairList;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Name: %s %s Id: %s Salary: %.2f", super.getFirstName(),
                super.getLastName(),
                super.getId(),
                super.getSalary())).append(System.lineSeparator()).
                append("Corps: ").append(this.getCorps()).
                append(System.lineSeparator()).
                append("Repairs: ");
        for (int i = 0; i < this.repairList.size(); i++) {
            str.append(System.lineSeparator()).append("  ").
                    append(this.repairList.get(i).toString());
        }
        return str.toString();
    }
}
