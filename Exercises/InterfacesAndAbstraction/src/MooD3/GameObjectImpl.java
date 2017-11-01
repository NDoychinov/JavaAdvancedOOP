package MooD3;

import MooD3.interfaces.GameObject;

/**
 * Created by Niki on 13.7.2016 г..
 */
public abstract class GameObjectImpl implements GameObject {
    private String userName;
    private String characterType;
    private int level;

    GameObjectImpl(String userName, String characterType, int level) {
        this.userName = userName;
        this.characterType = characterType;
        this.level = level;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public String getCharacterType() {
        return this.characterType;
    }

    @Override
    public double getSpecialPoints() {
        return 0;
    }

    @Override
    public String getHashedPassword() {
        return null;
    }
}
