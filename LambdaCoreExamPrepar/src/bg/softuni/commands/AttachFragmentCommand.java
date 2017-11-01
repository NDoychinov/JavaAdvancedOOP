package bg.softuni.commands;

import bg.softuni.annotations.Inject;
import bg.softuni.factories.fragmentFactory.FragmentFactory;
import bg.softuni.models.fragments.Fragment;
import bg.softuni.repository.Repository;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class AttachFragmentCommand extends Command {

    @Inject
    private String[] data;

    @Inject
    private FragmentFactory fragmentFactory;

    @Inject
    private Repository repository;

    @Override
    public String execute() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        String fragmentType = this.data[1];
        String fragmentName = this.data[2];
        int pressureAf = Integer.parseInt(this.data[3]);
        try {
            Fragment attachFragment = this.fragmentFactory.createFragment(fragmentType,
                    fragmentName,
                    pressureAf);

            this.repository.attachFragment(attachFragment);
            return String.format("Successfully attached Fragment %s to Core %s!",
                    fragmentName, this.repository.getSelectedCore().getName());
        } catch (IllegalArgumentException iae) {
            return String.format("Failed to attach Fragment %s!", fragmentName);
        }
    }
}
