package problemInfernoInfinity.weapons;

import problemInfernoInfinity.InfinitiInfo;
import problemInfernoInfinity.interfaces.Gem;
import problemInfernoInfinity.interfaces.Weapon;

/**
 * Created by Niki on 21.7.2016 г..
 */
@InfinitiInfo
public abstract class WeaponImpl implements Weapon {

    private static final int STRENGTH_MIN_MULTIPLIER = 2;
    private static final int STRENGTH_MAX_MULTIPLIER = 3;
    private static final int AGILITY_MIN_MULTIPLIER = 1;
    private static final int AGILITY_MAX_MULTIPLIER = 4;
    private static final int INITIAL_BONUS_STATS = 0;

    private String name;
    private int minDmg;
    private int maxDmg;
    private Gem[] gems;
    private int strength;
    private int agility;
    private int vitality;

    public WeaponImpl(String name, int minDmg, int maxDmg, int availableSockets) {
        this.setName(name);
        this.setMinDmg(minDmg);
        this.setMaxDmg(maxDmg);
        this.setAvailableSockets(availableSockets);
        this.setStrength(INITIAL_BONUS_STATS);
        this.setAgility(INITIAL_BONUS_STATS);
        this.setVitality(INITIAL_BONUS_STATS);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }

    private void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    private void setAvailableSockets(int availableSockets) {
        this.gems = new Gem[availableSockets];
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
        return strength;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getVitality() {
        return vitality;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getMinDmg() {
        return this.minDmg;
    }

    @Override
    public int getMaxDmg() {
        return this.maxDmg;
    }

    @Override
    public int getSockets() {
        return 0;
    }

    @Override
    public void addGem(int index, Gem gem) {
        if (index >= 0 && index < this.gems.length) {

            if (this.gems[index] != null) {
                this.reduceStatsForGem(this.gems[index]);
                this.gems[index] = null;
            }
            this.incrementStatsForGem(gem);
            this.gems[index] = gem;
        }
    }

    @Override
    public void removeGem(int index) {
        if (index >= 0 && index < this.gems.length) {
            this.reduceStatsForGem(this.gems[index]);
            this.gems[index] = null;
        }
    }

    @Override
    public double calculateWeaponLevel(){
        double sum = 0;
        sum += (double) (this.maxDmg + this.minDmg) / 2;
        sum += this.strength + this.agility + this.vitality;
        return sum;
    }

    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.getName(),
                this.getMinDmg(),
                this.getMaxDmg(),
                this.getStrength(),
                this.getAgility(),
                this.getVitality());
    }

    @Override
    public int compareTo(Weapon weapon) {
        return Double.compare(this.calculateWeaponLevel(),
                weapon.calculateWeaponLevel());
    }

    private void incrementMinDmg(int amount) {
        this.minDmg += amount;
    }

    private void reduceMinDmg(int amount) {
        this.minDmg -= amount;
    }

    private void incrementMaxDmg(int amount) {
        this.maxDmg += amount;
    }

    private void reduceMaxDmg(int amount) {
        this.maxDmg -= amount;
    }

    private void incrementStrength(int amount) {
        this.strength += amount;
    }

    private void reduceStrength(int amount) {
        this.strength -= amount;
    }

    private void incrementAgility(int amount) {
        this.agility += amount;
    }

    private void reduceAgility(int amount) {
        this.agility -= amount;
    }

    private void incrementVitality(int amount) {
        this.vitality += amount;
    }

    private void reduceVitality(int amount) {
        this.vitality -= amount;
    }

    private void incrementStatsForGem(Gem gem) {
        this.incrementMinDmg(gem.getStrength() * STRENGTH_MIN_MULTIPLIER);
        this.incrementMaxDmg(gem.getStrength() * STRENGTH_MAX_MULTIPLIER);
        this.incrementMinDmg(gem.getAgility() * AGILITY_MIN_MULTIPLIER);
        this.incrementMaxDmg(gem.getAgility() * AGILITY_MAX_MULTIPLIER);
        this.incrementStrength(gem.getStrength());
        this.incrementAgility(gem.getAgility());
        this.incrementVitality(gem.getVitality());
    }

    private void reduceStatsForGem(Gem gem) {
        this.reduceMinDmg(gem.getStrength() * STRENGTH_MIN_MULTIPLIER);
        this.reduceMaxDmg(gem.getStrength() * STRENGTH_MAX_MULTIPLIER);
        this.reduceMinDmg(gem.getAgility() * AGILITY_MIN_MULTIPLIER);
        this.reduceMaxDmg(gem.getAgility() * AGILITY_MAX_MULTIPLIER);
        this.reduceStrength(gem.getStrength());
        this.reduceAgility(gem.getAgility());
        this.reduceVitality(gem.getVitality());
    }
}
