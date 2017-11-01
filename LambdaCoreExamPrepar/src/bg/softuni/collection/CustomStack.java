package bg.softuni.collection;

import bg.softuni.models.fragments.Fragment;

/**
 * Created by Niki on 4.8.2016 г..
 */
public interface CustomStack {

    Fragment pop();

    Fragment peek();

    Boolean isEmpty();

    Fragment push(Fragment item);

    Integer size();
}
