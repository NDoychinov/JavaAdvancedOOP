package GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 14.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(sc.readLine());
        List<Box> boxList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            boxList.add(new Box(Double.parseDouble(sc.readLine())));
        }
        Double compare = Double.parseDouble(sc.readLine());

        int amount = comparer(boxList, compare);

        System.out.println(amount);
    }

    public static <T extends Comparable> int comparer(List<T> list, Double compItem) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(compItem) > 0){
                count++;
            }
        }
        return count;
    }
}
