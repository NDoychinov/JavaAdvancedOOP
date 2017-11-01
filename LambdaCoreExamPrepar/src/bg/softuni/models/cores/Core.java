package bg.softuni.models.cores;

import bg.softuni.enums.StatusType;
import bg.softuni.models.fragments.Fragment;

/**
 * Created by Niki on 3.8.2016 г..
 */
public interface Core {

    String getType();

    int getFragmentsAmount();

    int getDurability();

    StatusType status();

    String getName();

    boolean attachFragment(Fragment fragment);

    String detachFragment();
}
