package problemInfernoInfinity.gems;

import problemInfernoInfinity.interfaces.Gem;

/**
 * Created by Niki on 21.7.2016 г..
 */
public abstract class GemImpl implements Gem {

    private int strength;
    private int agility;
    private int vitality;

    public GemImpl(int strength, int agility, int vitality) {
        this.setStrength(strength);
        this.setAgility(agility);
        this.setVitality(vitality);
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private void setAgility(int agility) {
        this.agility = agility;
    }

    private void setVitality(int vitality) {
        this.vitality = vitality;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public int getAgility() {
        return this.agility;
    }

    @Override
    public int getVitality() {
        return this.vitality;
    }
}
