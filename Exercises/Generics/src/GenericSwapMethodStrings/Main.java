package GenericSwapMethodStrings;


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
            boxList.add(new Box(sc.readLine()));
        }
        String[] numbers = sc.readLine().split("\\s+");
        int index1 = Integer.parseInt(numbers[0]);
        int index2 = Integer.parseInt(numbers[1]);

        boxList = swaper(boxList, index1, index2);


        for (int i = 0; i < boxList.size(); i++) {
            System.out.println(boxList.get(i).toString());
        }
    }

    public static <T> List<T> swaper(List<T> list, int index1, int index2) {
        T el = list.get(index2);
        list.set(index2, list.get(index1));
        list.set(index1, el);
        return list;
    }
}


