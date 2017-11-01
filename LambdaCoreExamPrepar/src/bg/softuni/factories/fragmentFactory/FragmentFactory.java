package bg.softuni.factories.fragmentFactory;

import bg.softuni.models.fragments.Fragment;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public interface FragmentFactory {

    Fragment createFragment(String type, String name, int pressure) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
