package problemBarracksWars.core.commands;

import problemBarracksWars.contracts.Executable;
import problemBarracksWars.contracts.Repository;
import problemBarracksWars.contracts.UnitFactory;

/**
 * Created by Niki on 3.8.2016 г..
 */
public abstract class Command implements Executable {

    String[] data;
    private Repository repository;
    private UnitFactory factory;

    protected Command(String[] data, Repository repository, UnitFactory factory) {
        this.data = data;
        this.repository = repository;
        this.factory = factory;
    }

    public String[] getData() {
        return data;
    }

    public Repository getRepository() {
        return repository;
    }

    public UnitFactory getFactory() {
        return factory;
    }

    @Override
    public abstract String execute();
}
