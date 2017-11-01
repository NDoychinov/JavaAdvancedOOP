package MooD3;

import MooD3.interfaces.GameObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 13.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] data = sc.readLine().split("[| ]+");

        List<GameObject> gameObjectList = new ArrayList<>();
        if (data[1].equals("Demon")) {
            GameObject gameObject = new DemonImpl(data[0],
                    Integer.parseInt(data[3]),
                    Double.parseDouble(data[2]));
            gameObjectList.add(gameObject);
        } else if (data[1].equals("Archangel")) {
            GameObject gameObject = new ArchangelImpl(data[0],
                    Integer.parseInt(data[3]),
                    Integer.parseInt(data[2]));
            gameObjectList.add(gameObject);
        }

        for (int i = 0; i < gameObjectList.size(); i++) {
            System.out.println(gameObjectList.get(i).toString());
        }
    }
}
