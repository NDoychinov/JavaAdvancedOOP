package problemInfernoInfinity.interfaces;

/**
 * Created by Niki on 21.7.2016 г..
 */
public interface WeaponContainer {

    void addWeapon(Weapon weapon);

    Weapon getWeaponByName(String name);

    void printWeapons();

    void printWeapon(String name);

    void printBetterWeaponOfTwo(String name, String otherName);
}
