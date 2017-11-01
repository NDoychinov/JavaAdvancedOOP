package problemInfernoInfinity.commands;

import problemInfernoInfinity.InfinitiInfo;
import problemInfernoInfinity.gems.Amethyst;
import problemInfernoInfinity.gems.Emerald;
import problemInfernoInfinity.gems.Ruby;
import problemInfernoInfinity.interfaces.CommandIntepreter;
import problemInfernoInfinity.interfaces.Gem;
import problemInfernoInfinity.interfaces.WeaponContainer;
import problemInfernoInfinity.weapons.Axe;
import problemInfernoInfinity.weapons.Knife;
import problemInfernoInfinity.weapons.Sword;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class Command implements CommandIntepreter {

    private WeaponContainer weapons;

    public Command(WeaponContainer weapons) {
        this.setWeapons(weapons);
    }

    private void setWeapons(WeaponContainer weapons) {
        this.weapons = weapons;
    }

    @Override
    public void intepretCommand(String input) {
        String[] data = input.split(";");
        String commandName = data[0].toLowerCase();
        parseCommand(commandName, data);
    }

    private void parseCommand(String command, String[] data) {
        switch (command) {
            case "create":
                String weaponType = data[1].toLowerCase();
                if (weaponType.equals("sword")) {
                    this.weapons.addWeapon(new Sword(data[2]));
                } else if (weaponType.equals("axe")) {
                    this.weapons.addWeapon(new Axe(data[2]));
                } else if (weaponType.equals("knife")) {
                    this.weapons.addWeapon(new Knife(data[2]));
                }
                break;
            case "add":
                Gem gem = null;
                String gemType = data[3].toLowerCase();
                if (gemType.equals("ruby")) {
                    gem = new Ruby();
                } else if (gemType.equals("emerald")) {
                    gem = new Emerald();
                } else if (gemType.equals("amethyst")) {
                    gem = new Amethyst();
                }

                this.weapons.getWeaponByName(data[1]).
                        addGem(Integer.parseInt(data[2]), gem);

                break;
            case "remove":
                this.weapons.getWeaponByName(data[1]).removeGem(Integer.parseInt(data[2]));

                break;
            case "print":
                this.weapons.printWeapon(data[1]);
                break;

            case "compare":
                this.weapons.printBetterWeaponOfTwo(data[1], data[2]);
                break;

            case "author":
                System.out.println("Author: " +  InfinitiInfo.author);
                break;
            case "revision":
                System.out.println("Revision: " + InfinitiInfo.revision);
                break;
            case "description":
                System.out.println("Class description: " + InfinitiInfo.description);
                break;
            case "reviewers":
                System.out.println("Reviewers: " + InfinitiInfo.reviewers);
                break;
        }
    }
}
