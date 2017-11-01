package bg.softuni.factories.fragmentFactory;

import bg.softuni.models.fragments.Fragment;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Niki on 4.8.2016 г..
 */
public class FragmentFactoryImpl implements FragmentFactory {

    private static final String FRAGMENT_PACKAGE = "bg.softuni.models.fragments.";
    private static final String FAIL_TO_ATTACH_EXCEPTION_MESSAGE = "Failed to attach Fragment %s!";

    @Override
    public Fragment createFragment(String type, String name, int pressure) throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        try {
            String className = FRAGMENT_PACKAGE + type + "Fragment";
            Class<?> fragmentClass = Class.forName(className);
            Constructor<?> ctor = fragmentClass.getConstructor(String.class, Integer.class);
            return (Fragment) ctor.newInstance(name, pressure);
        } catch (ReflectiveOperationException roe) {
            throw new IllegalArgumentException(String.format(FAIL_TO_ATTACH_EXCEPTION_MESSAGE, name));
        }
    }
}
