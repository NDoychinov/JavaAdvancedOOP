package MilitaryElite;

import MilitaryElite.Interfaces.*;
import MilitaryElite.Soldiers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Private> privateList = new HashMap<>();
        List<Soldier> soldiers = new ArrayList<>();

        String input = sc.readLine();
        while (!input.equals("End")) {
            String[] data = input.split("\\s+");

            switch (data[0]) {
                case "Private":
                    Private privateSoldier = new Private(data[1],
                            data[2],
                            data[3],
                            Double.parseDouble(data[4]));
                    privateList.put(privateSoldier.getId(), privateSoldier);
                    soldiers.add(privateSoldier);
                    break;
                case "LeutenantGeneral":
                    LeutenantImpl leutenant = new LeutenantGeneral(data[1],
                            data[2],
                            data[3],
                            Double.parseDouble(data[4]));

                    for (int i = 5; i < data.length; i++) {
                        leutenant.addPrivate(privateList.get(data[i]));
                    }
                    soldiers.add((Soldier) leutenant);
                    break;
                case "Engineer":
                    try {
                        EngineerImpl engineer = new Engineer(data[1],
                                data[2],
                                data[3],
                                Double.parseDouble(data[4]),
                                data[5]);
                        for (int i = 6; i < data.length; i += 2) {
                            Repairable repair = new Repair(data[i],
                                    Integer.parseInt(data[i + 1]));
                            engineer.addRepair(repair);
                        }
                        soldiers.add((Soldier) engineer);
                    } catch (IllegalArgumentException e) {

                    }
                    break;

                case "Commando":
                    try {
                        CommandoImpl commando = new Commando(data[1],
                                data[2],
                                data[3],
                                Double.parseDouble(data[4]),
                                data[5]);
                        for (int i = 6; i < data.length; i += 2) {
                            try {
                                Missionable mission = new Mission(data[i], data[i + 1]);
                                commando.addMission(mission);
                            } catch (IllegalArgumentException e) {

                            }
                        }
                        soldiers.add((Soldier) commando);
                    } catch (IllegalArgumentException e) {

                    }
                    break;

                case "Spy":
                    SpyImpl spy = new Spy(data[1],
                            data[2],
                            data[3],
                            Integer.parseInt(data[4]));
                    soldiers.add((Soldier) spy);
                    break;

            }

            input = sc.readLine();
        }

        for (int i = 0; i < soldiers.size(); i++) {
            System.out.println(soldiers.get(i).toString());
        }
    }
}
