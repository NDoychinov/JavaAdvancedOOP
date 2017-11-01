package problemInfernoInfinity;

import problemInfernoInfinity.interfaces.Weapon;
import problemInfernoInfinity.interfaces.WeaponContainer;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class WeaponContainerImpl implements WeaponContainer {

    private LinkedList<Weapon> weapons;

    public WeaponContainerImpl() {
        this.weapons = new LinkedList<>();
    }

    @Override
    public void addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
    }

    @Override
    public Weapon getWeaponByName(String name) {

        for (int i = 0; i < this.weapons.size(); i++) {
            if (this.weapons.get(i).getName().equals(name)) {
                return this.weapons.get(i);
            }
        }
        throw new NoSuchElementException("That weapon not exict");
    }



    @Override
    public void printWeapons() {
        for (int i = 0; i < this.weapons.size(); i++) {
            System.out.println(this.weapons.get(i).toString());
        }
    }

    @Override
    public void printWeapon(String name) {
        for (int i = 0; i < this.weapons.size(); i++) {
            if (this.weapons.get(i).getName().equals(name)){
                System.out.println(this.weapons.get(i).toString());
            }
        }
    }

    @Override
    public void printBetterWeaponOfTwo(String name, String otherName) {
        Weapon weapon = this.getWeaponByName(name);
        Weapon otherWeapon = this.getWeaponByName(otherName);
        Weapon betterWeapon = getBetterWeaponOfTwo(weapon, otherWeapon);

        System.out.printf("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality (Item Level: %.1f)%n",
                betterWeapon.getName(),
                betterWeapon.getMinDmg(),
                betterWeapon.getMaxDmg(),
                betterWeapon.getStrength(),
                betterWeapon.getAgility(),
                betterWeapon.getVitality(),
                betterWeapon.calculateWeaponLevel());
    }

    private Weapon getBetterWeaponOfTwo(Weapon weapon, Weapon otherWeapon){
        if (weapon.compareTo(otherWeapon) > 0){
            return weapon;
        } else {
            return otherWeapon;
        }
    }
}
