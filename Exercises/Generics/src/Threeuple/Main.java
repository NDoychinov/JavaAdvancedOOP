package Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Threeuplable<String, String, String> tuple = new Threeuple<String, String, String>();

        String[] data = sc.readLine().split("\\s+");
        tuple.put(data[0] + " " + data[1], data[2], data[3]);
        System.out.println(tuple.toString());

        Threeuplable<String, Integer, Boolean> tuple1 = new Threeuple<String, Integer, Boolean>();
        data = sc.readLine().split("\\s+");
        Boolean isDrunk = false;
        if (data[2].equals("drunk")) {
            isDrunk = true;
        }

        tuple1.put(data[0], Integer.parseInt(data[1]), isDrunk);
        System.out.println(tuple1.toString());

        Threeuplable<String, Double, String> tuple2 = new Threeuple<String, Double, String>();
        data = sc.readLine().split("\\s+");
        tuple2.put(data[0], Double.parseDouble(data[1]), data[2]);
        System.out.println(tuple2.toString());
    }
}
