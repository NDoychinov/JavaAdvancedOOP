package problemBarracksWars.core.commands;

import problemBarracksWars.contracts.Repository;
import problemBarracksWars.contracts.UnitFactory;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class RetireCommand extends Command {

    public RetireCommand(String[] data, Repository repository, UnitFactory factory) {
        super(data, repository, factory);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        this.getRepository().removeUnit(unitType);

        return String.format("%s retired!", unitType);
    }
}
