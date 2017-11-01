package BirthdayCelebrations;

import BirthdayCelebrations.Interfaces.Buyer;
import BirthdayCelebrations.Models.Citizen;
import BirthdayCelebrations.Models.Rebel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 12.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Buyer> buyers = new ArrayList<>();

        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            String[] data = sc.nextLine().split("\\s+");

            if (data.length == 4) {
                buyers.add(new Citizen(data[0],
                        Integer.parseInt(data[1]),
                        data[2],
                        data[3]));
            } else {
                buyers.add(new Rebel(data[0], Integer.parseInt(data[1]), data[2]));
            }
        }

        String input = sc.nextLine();

        while (!input.equals("End")){
            for (int i = 0; i < buyers.size(); i++) {
                Buyer currBuyer = buyers.get(i);
                if (currBuyer.getName().equals(input)){
                    currBuyer.buyFood();
                }
            }

            input = sc.nextLine();
        }

        int totalBuyed = 0;
        for (int i = 0; i < buyers.size(); i++) {
            totalBuyed += buyers.get(i).foodAmount();
        }
        System.out.println(totalBuyed);
    }
}

