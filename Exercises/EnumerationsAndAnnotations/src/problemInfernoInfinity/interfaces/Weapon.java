package problemInfernoInfinity.interfaces;

/**
 * Created by Niki on 21.7.2016 г..
 */
public interface Weapon extends Comparable<Weapon> {

    int getMinDmg();

    int getMaxDmg();

    String getName();

    int getSockets();

    int getStrength();

    int getAgility();

    int getVitality();

    void addGem(int index, Gem gem);

    void removeGem(int index);

    double calculateWeaponLevel();
}
