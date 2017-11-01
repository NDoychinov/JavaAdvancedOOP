package MooD3;

import MooD3.interfaces.Archangel;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class ArchangelImpl extends  GameObjectImpl implements Archangel {
    private static final String CHARACTER_TYPE  = "Archangel";

    private int mana;

    public ArchangelImpl(String userName, int level, int mana) {
        super(userName, CHARACTER_TYPE, level);
        this.mana = mana;
    }

    @Override
    public int getMana() {
        return this.mana;
    }

    @Override
    public String getHashedPassword() {
        StringBuilder hashed = new StringBuilder(super.getUserName());
        hashed.reverse().append(String.valueOf(super.getUserName().length() * 21));

        return hashed.toString();
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n%d", super.getUserName(),
                this.getHashedPassword(),
                super.getCharacterType(),
                this.getMana() * super.getLevel());
    }
}
