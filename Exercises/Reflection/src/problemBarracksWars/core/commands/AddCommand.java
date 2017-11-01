package problemBarracksWars.core.commands;

import problemBarracksWars.contracts.Repository;
import problemBarracksWars.contracts.Unit;
import problemBarracksWars.contracts.UnitFactory;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class AddCommand extends Command {

    public AddCommand(String[] data, Repository repository, UnitFactory factory) {
        super(data, repository, factory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        Unit unitToAdd = this.getFactory().createUnit(unitType);
        this.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
