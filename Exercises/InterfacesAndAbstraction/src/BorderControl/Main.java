package BorderControl;

import BorderControl.interfaces.FakeCheckable;
import BorderControl.interfaces.Identifiable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Niki on 11.7.2016 г..
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Identifiable> ids = new ArrayList<>();

        String input = sc.nextLine();

        while (!input.equals("End")){
            String[] data = input.split("\\s+");

            if (data.length == 3){
                ids.add(new Citizen(data[0],
                        Integer.parseInt(data[1]),
                        data[2]));
            } else if (data.length == 2){
                ids.add(new Robot(data[0], data[1]));
            }

            input = sc.nextLine();
        }

        String fake = sc.nextLine();

        FakeCheckable checker = new IdChecker(fake);

        for (int i = 0; i < ids.size(); i++) {
            Identifiable currId = ids.get(i);
            if (checker.checkId(currId.getId())){
                System.out.println(currId.getId());
            }
        }
    }
}
