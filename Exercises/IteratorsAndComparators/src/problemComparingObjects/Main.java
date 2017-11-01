package problemComparingObjects;

import problemComparingObjects.interfaces.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Niki on 19.7.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        List<Person> personList = new ArrayList<>();

        String[] data = sc.readLine().trim().split("\\s+");

        while (!data[0].equals("END")) {
            personList.add(new PersonImpl(data[0],
                    Integer.parseInt(data[1]),
                    data[2]));

            data = sc.readLine().trim().split("\\s+");
        }

        int index = Integer.parseInt(sc.readLine());
        if (index >= 0 && index < personList.size()) {
            Person coparePerson = personList.get(index);

            int equalPersons = 0;
            for (int i = 0; i < personList.size(); i++) {
                if (coparePerson.compareTo(personList.get(i)) == 0) {
                    equalPersons++;
                }
            }

            int allPersons = personList.size();
            System.out.printf("%d %d %d", equalPersons,
                    allPersons - equalPersons,
                    allPersons);
        } else {
            System.out.println("No matches");
        }
    }
}
