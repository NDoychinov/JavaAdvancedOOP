package bg.softuni.commands;

import bg.softuni.annotations.Inject;
import bg.softuni.models.cores.Core;
import bg.softuni.repository.Repository;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class RemoveCoreCommand extends Command {

    @Inject
    private String[] data;

    @Inject
    private Repository repository;

    @Override
    public String execute() {
        String name = this.data[1];
        try {
            Core removed = this.repository.removeCore(name);
            return String.format("Successfully removed Core %s!", removed.getName());
        } catch (IllegalArgumentException iae) {
            return iae.getMessage();
        }
    }
}
