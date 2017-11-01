package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Niki on 15.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Tuplable<String, String> tuple = new Tuple<String, String>();

        String[] data = sc.readLine().split("\\s+");
        tuple.put(data[0] + " " + data[1], data[2]);
        System.out.println(tuple.toString());

        Tuplable<String, Integer> tuple1 = new Tuple<String, Integer>();
        data = sc.readLine().split("\\s+");
        tuple1.put(data[0], Integer.parseInt(data[1]));
        System.out.println(tuple1.toString());

        Tuplable<Integer, Double> tuple2 = new Tuple<Integer, Double>();
        data = sc.readLine().split("\\s+");
        tuple2.put(Integer.parseInt(data[0]), Double.parseDouble(data[1]));
        System.out.println(tuple2.toString());
    }
}
