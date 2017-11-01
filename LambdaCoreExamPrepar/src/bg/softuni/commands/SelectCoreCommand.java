package bg.softuni.commands;

import bg.softuni.annotations.Inject;
import bg.softuni.models.cores.Core;
import bg.softuni.repository.Repository;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class SelectCoreCommand extends Command {

    @Inject
    private String[] data;

    @Inject
    private Repository repository;

    @Override
    public String execute() {
        String name = this.data[1];
        try {
            Core selectedCore = this.repository.selectCore(name);
            return String.format("Currently selected Core %s!", selectedCore.getName());
        } catch (IllegalArgumentException iae) {
            return iae.getMessage();
        }
    }
}
