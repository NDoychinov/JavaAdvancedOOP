package GenericBox;

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
        int count = Integer.parseInt(sc.readLine());
        List<Box> boxList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            boxList.add(new Box(Integer.parseInt(sc.readLine())));
        }

        for (int i = 0; i < boxList.size(); i++) {
            System.out.println(boxList.get(i).toString());
        }
    }
}
