package problemInfernoInfinity;

import problemInfernoInfinity.commands.Command;
import problemInfernoInfinity.interfaces.CommandIntepreter;
import problemInfernoInfinity.interfaces.WeaponContainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 21.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        WeaponContainer weapons = new WeaponContainerImpl();
        CommandIntepreter intepreter = new Command(weapons);

        String input = sc.readLine().trim();
        while (!input.equalsIgnoreCase("end")){
            intepreter.intepretCommand(input);

            input = sc.readLine().trim();
        }
    }
}
