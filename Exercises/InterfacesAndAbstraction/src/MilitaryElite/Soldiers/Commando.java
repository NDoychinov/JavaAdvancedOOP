package MilitaryElite.Soldiers;

import MilitaryElite.Interfaces.CommandoImpl;
import MilitaryElite.Interfaces.Missionable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Commando extends SpecialisedSoldier implements CommandoImpl {
    private List<Missionable> missionList;

    public Commando(String id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missionList = new ArrayList<>();
    }

    @Override
    public void addMission(Missionable mission) {
        this.missionList.add(mission);
    }

    @Override
    public List<Missionable> getMissions() {
        return this.missionList;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(String.format("Name: %s %s Id: %s Salary: %.2f%n", super.getFirstName(),
                super.getLastName(),
                super.getId(),
                super.getSalary()));
        str.append("Corps: ").append(super.getCorps()).
                append(System.lineSeparator()).
                append("Missions: ");
        for (int i = 0; i < this.missionList.size(); i++) {
            str.append(System.lineSeparator()).append("  ").
                    append(this.missionList.get(i).toString());
        }
        return str.toString();
    }
}
