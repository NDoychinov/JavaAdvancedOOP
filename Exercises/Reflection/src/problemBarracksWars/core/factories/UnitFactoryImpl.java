package problemBarracksWars.core.factories;

import problemBarracksWars.contracts.Unit;
import problemBarracksWars.contracts.UnitFactory;

import java.lang.reflect.Constructor;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "problemBarracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        try {
            Class<?> unit = Class.forName(UNITS_PACKAGE_NAME + unitType);
            Constructor ctor = unit.getConstructor();
            ctor.setAccessible(true);
            return (Unit) ctor.newInstance();
        } catch (ReflectiveOperationException e) {
            e.getStackTrace();
            throw new IllegalArgumentException();
        }
    }
}
