package bg.softuni.commands;

import bg.softuni.annotations.Inject;
import bg.softuni.repository.Repository;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class DetachFragmentCommand extends Command {

    @Inject
    private Repository repository;

    @Override
    public String execute() {
        return this.repository.detachFragment();
    }
}
