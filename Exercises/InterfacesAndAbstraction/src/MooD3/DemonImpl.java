package MooD3;

import MooD3.interfaces.Demon;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class DemonImpl extends GameObjectImpl implements Demon {

    private static final String CHARACTER_TYPE  = "Demon";
    private double energy;

    public DemonImpl(String userName, int level, Double energy) {
        super(userName, CHARACTER_TYPE, level);
        this.energy = energy;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public String getHashedPassword() {
        return String.valueOf(super.getUserName().length() * 217);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n%.1f", super.getUserName(),
                this.getHashedPassword(),
                super.getCharacterType(),
                this.getEnergy() * super.getLevel());
    }
}
