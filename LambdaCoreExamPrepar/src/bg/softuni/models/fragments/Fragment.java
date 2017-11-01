package bg.softuni.models.fragments;

import bg.softuni.enums.FragmentType;

/**
 * Created by Niki on 3.8.2016 г..
 */
public interface Fragment {

    Integer getPressureAffection();

    FragmentType getType();

    String getName();

}
