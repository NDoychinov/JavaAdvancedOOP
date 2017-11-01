package bg.softuni.repository;

import bg.softuni.models.cores.Core;
import bg.softuni.models.fragments.Fragment;

/**
 * Created by Niki on 3.8.2016 г..
 */
public interface Repository extends Iterable<Core> {

    void addCore(Core coreToAdd);

    int getTotalFragments();

    int getTotalCores();

    int getTotalDurability();

    String detachFragment();

    void attachFragment(Fragment fragment);

    Core selectCore(String name);

    Core removeCore(String name);

    Core getSelectedCore();
}
