package problemBarracksWars.core.commands;

import problemBarracksWars.contracts.Repository;
import problemBarracksWars.contracts.UnitFactory;

/**
 * Created by Niki on 3.8.2016 г..
 */
public class FightCommand extends Command {

    public FightCommand(String[] data, Repository repository, UnitFactory factory) {
        super(data, repository, factory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
